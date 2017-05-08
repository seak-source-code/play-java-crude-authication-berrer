package repositories.Impl;

import models.User;
import repositories.UserRepo;

import java.util.List;

/**
 * Created by kimseak on 5/7/17.
 */
public class UserRepoImpl implements UserRepo {
    @Override
    public void saveUser(User user) {
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
