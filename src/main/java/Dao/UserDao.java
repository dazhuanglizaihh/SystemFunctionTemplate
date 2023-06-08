package Dao;

import Entity.User;
import org.springframework.stereotype.Repository;

@Repository
public interface UserDao {

    int addUser(User user);

}
