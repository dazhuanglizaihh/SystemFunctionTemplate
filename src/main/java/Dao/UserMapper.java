package Dao;

import Entity.User;
import org.springframework.stereotype.Repository;

@Repository
public interface UserMapper {

    int addUser(User user);

}
