package Service.Impl;

import Dao.Impl.UserDaoImpl;
import Dao.UserDao;
import Entity.User;
import Service.UserService;

public class UserServiceImpl implements UserService {

    private UserDao userDao;

    public void setUserDao(UserDaoImpl userDaoImpl) {
        this.userDao = userDaoImpl;
    }

    @Override
    public int addUser(User user) {
        return userDao.addUser(user);
    }
}
