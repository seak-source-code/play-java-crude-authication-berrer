package repositories.Impl;

import com.avaje.ebean.Ebean;
import models.User;
import models.UserRole;
import repositories.UserRepo;

import java.util.List;

/**
 * Created by kimseak on 5/7/17.
 */
public class UserRepoImpl implements UserRepo {

    @Override
    public void saveUser(User user, long roleId) {
        UserRole role = Ebean.find(UserRole.class, roleId);
        user.userRole = role;
        user.save();
    }

    @Override
    public List<User> findAllUser() {
        return User.find.all();
    }

    @Override
    public boolean updateUser(long id) {
        return false;
    }

    @Override
    public boolean deleteUser(long id) {
        return false;
    }
}
