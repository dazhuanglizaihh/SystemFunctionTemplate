package Dao;

import Entity.User;
import org.springframework.stereotype.Repository;

import java.util.List;


public interface UserMapper {

    public List<User> queryAllUser();

}
