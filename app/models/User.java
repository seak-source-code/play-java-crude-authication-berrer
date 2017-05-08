package models;

import com.avaje.ebean.Model;
import play.data.validation.Constraints;

import javax.persistence.*;
import java.io.UnsupportedEncodingException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/**
 * Created by kimseak on 5/7/17.
 */

@Entity
@Table(name = "user")
public class User extends Model {

    @Id
    public long id;

    @Column
    @Constraints.Required
    public String username;

    @Column
    @Constraints.Required
    public String password;

    @OneToOne(mappedBy = "user")
    private UserToken userToken;



    public static byte[] getSha512(String value) {
        try {
            return MessageDigest.getInstance("SHA-512").digest(value.getBytes("UTF-8"));
        }
        catch (NoSuchAlgorithmException e) {
            throw new RuntimeException(e);
        }
        catch (UnsupportedEncodingException e) {
            throw new RuntimeException(e);
        }
    }

    public static Finder<Long, User> find = new Finder<Long, User>(User.class);

    public static User findByNameAndPassword(String username, String password) {
        return User.find.where().eq("username", username).eq("password", password).findUnique();
    }


}
