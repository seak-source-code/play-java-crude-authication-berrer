package models;

import com.avaje.ebean.Ebean;
import com.avaje.ebean.Model;
import org.springframework.beans.factory.annotation.Required;
import play.data.validation.Constraints;

import javax.persistence.*;
import java.util.Calendar;
import java.util.Date;
import java.util.UUID;

/**
 * Created by kimseak on 5/7/17.
 */
@Entity
@Table(name = "UserToken")
public class UserToken extends Model{

    @Id
    private long id;

    @Column
    @Constraints.Required
    public String authToken;

    @Column
    @Constraints.Required
    public Date expriedDate;

    @OneToOne
    @JoinColumn(name = "user_id")
    public User user;


    //generate expired date
    public Date generateExpiredDate() {

        Date date = new Date();
        Calendar cal = Calendar.getInstance();
        cal.setTime(date);
        cal.add(Calendar.MINUTE, 30);

        expriedDate = cal.getTime();
        return  expriedDate;
    }


    //generate token
    public String generateAuthToken() {
        authToken = UUID.randomUUID().toString();
        return authToken;
    }

    //check expired date
    public boolean isExpire(Date expriedDate){
        Date today = new Date();
        if(expriedDate.after(today))
            return true;
        else
            return false;
    }

    private  void deleteUserToken(Long userId){
        UserToken token = UserToken.find.where().eq("user_id", userId.toString()).findUnique();
        if(token == null)
            return;
        token.delete();
    }


    public  String createToken(Long userId){

        deleteUserToken(userId);

        UserToken userToken = new UserToken();
        userToken.authToken = generateAuthToken();
        userToken.expriedDate = generateExpiredDate();

        User user = Ebean.find(User.class, userId);

        userToken.user = user;

        userToken.save();

        return authToken;

    }


    public static Finder<Long, UserToken> find = new Finder<Long, UserToken>(UserToken.class);



}
