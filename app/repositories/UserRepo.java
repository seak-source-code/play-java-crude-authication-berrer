package repositories;

import com.google.inject.ImplementedBy;
import models.User;
import repositories.Impl.UserRepoImpl;

import java.util.List;

/**
 * Created by kimseak on 5/7/17.
 */
@ImplementedBy(UserRepoImpl.class)
public interface UserRepo {
    
    void saveUser(User user);
    
    List<User> findAllUser();
    
    boolean updateUser(long id);
    
    boolean deleteUser(long id);
    
    
}
