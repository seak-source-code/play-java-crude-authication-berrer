package services.Impl;

import models.User;
import repositories.UserRepo;
import services.UserService;

import javax.inject.Inject;
import java.util.List;

/**
 * Created by kimseak on 5/7/17.
 */
public class UserServiceImpl implements UserService {

    @Inject
    UserRepo repo;

    @Override
    public void saveUser(User user, long roleId) {
        repo.saveUser(user, roleId);
    }

    @Override
    public List<User> findAllUser() {
        return repo.findAllUser();
    }

    @Override
    public boolean updateUser() {
        return false;
    }

    @Override
    public boolean deleteUser() {
        return false;
    }
}
