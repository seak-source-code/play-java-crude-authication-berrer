package services;

import com.google.inject.ImplementedBy;
import models.User;
import services.Impl.UserServiceImpl;

import java.util.List;

/**
 * Created by kimseak on 5/7/17.
 */
@ImplementedBy(UserServiceImpl.class)
public interface UserService  {

    void saveUser(User user, long roleId);

    List<User> findAllUser();

    boolean updateUser();

    boolean deleteUser();

}
