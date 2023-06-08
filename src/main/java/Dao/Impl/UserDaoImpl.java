package Dao.Impl;

import Dao.UserDao;
import Entity.User;
import org.springframework.jdbc.core.JdbcTemplate;

public class UserDaoImpl implements UserDao {

    private JdbcTemplate jdbcTemplate;

    public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    @Override
    public int addUser(User user) {
        String sql = "INSERT INTO `user` (`user`.`username`, `user`.`email`, `user`.`password`, `user`.`status`) VALUES(?,?,?,?);";
        int update = jdbcTemplate.update(sql, user.getName(), user.getEmail(), user.getPassword(), user.getStatus());
        return update;
    }
}
