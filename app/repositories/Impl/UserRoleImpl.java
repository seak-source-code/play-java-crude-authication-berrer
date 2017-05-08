package repositories.Impl;

import models.UserRole;
import repositories.UserRoleRepo;

import java.util.List;

/**
 * Created by kimseak on 5/8/17.
 */
public class UserRoleImpl implements UserRoleRepo {
    @Override
    public void saveUserRole(UserRole userRole) {
        userRole.save();
    }

    @Override
    public List<UserRole> findAllUserRole() {
        return UserRole.find.all();
    }

    @Override
    public boolean updateUserRole(long id) {
        return false;
    }

    @Override
    public boolean deleteUserRple(long id) {
        return false;
    }
}
