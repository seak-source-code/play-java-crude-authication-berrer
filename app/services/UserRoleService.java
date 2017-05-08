package services;

import com.google.inject.ImplementedBy;
import models.UserRole;
import services.Impl.UserRoleServiceImpl;

import java.util.List;

/**
 * Created by kimseak on 5/8/17
 */

@ImplementedBy(UserRoleServiceImpl.class)
public interface UserRoleService {

    void saveUserRole(UserRole userRole);

    List<UserRole> findAllUserRole();
}
