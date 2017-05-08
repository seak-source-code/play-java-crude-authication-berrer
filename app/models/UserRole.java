package models;

import com.avaje.ebean.Model;
import play.data.validation.Constraints;

import javax.persistence.Entity;
import javax.persistence.*;
import javax.persistence.Table;

/**
 * Created by kimseak on 5/8/17.
 */
@Entity
@Table(name = "UserRole")
public class UserRole extends Model {

    @Id
    private long Id;

    @Column
    @Constraints.Required
    public String status;

    @Column
    @Constraints.Required
    public String description;

    @OneToOne(mappedBy = "userRole")
    private User user;


    public static Finder<Long, UserRole> find = new Finder<Long, UserRole>(UserRole.class);

}
