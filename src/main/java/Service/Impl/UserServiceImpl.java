package Service.Impl;

import Dao.UserMapper;
import Entity.User;
import Service.UserService;
import java.util.List;

public class UserServiceImpl implements UserService {

    private UserMapper userMapper;

    public void setUserMapper(UserMapper userMapper) {
        this.userMapper = userMapper;
    }

    @Override
    public List<User> queryAllUser() {
        return userMapper.queryAllUser();
    }
}
