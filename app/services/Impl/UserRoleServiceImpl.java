package services.Impl;

import models.UserRole;
import repositories.UserRoleRepo;
import services.UserRoleService;
import services.UserService;

import javax.inject.Inject;
import java.util.List;

/**
 * Created by kimseak on 5/8/17.
 */
public class UserRoleServiceImpl implements UserRoleService {

    @Inject
    UserRoleRepo repo;

    @Override
    public void saveUserRole(UserRole userRole) {
        repo.saveUserRole(userRole);

    }

    @Override
    public List<UserRole> findAllUserRole() {
        return repo.findAllUserRole();
    }
}
