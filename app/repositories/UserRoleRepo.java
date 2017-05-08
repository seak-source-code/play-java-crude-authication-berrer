package repositories;

import com.google.inject.ImplementedBy;
import models.UserRole;
import repositories.Impl.UserRepoImpl;
import repositories.Impl.UserRoleImpl;

import java.util.List;

/**
 * Created by kimseak on 5/8/17.
 */

@ImplementedBy(UserRoleImpl.class)
public interface UserRoleRepo {

    void saveUserRole(UserRole userRole);

    List<UserRole> findAllUserRole();

    boolean updateUserRole(long id);

    boolean deleteUserRple(long id);

}
