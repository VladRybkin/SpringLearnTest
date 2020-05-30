package ua.training.model.dao.impl;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;
import ua.training.model.dao.JDBCUserDao;
import ua.training.model.entity.SimpleUser;
import ua.training.model.entity.rowMappers.UserRowMapper;

import java.util.List;

@Component
public class JDBCUserDaoImpl implements JDBCUserDao {

    @Autowired
    private JdbcTemplate jdbcTemplate;


    @Override
    public void insertUser(int id, String name) {
        jdbcTemplate.execute(String.format("INSERT INTO `simpleusers`(`id`, `username`) VALUES(%d, '%s');", id, name));

    }


    @Override
    public List<SimpleUser> getUsers() {
        return jdbcTemplate.query("select * from simpleusers", new UserRowMapper());
    }

    //    public User getUserById(int id) {
    //        return jdbcTemplate.queryForObject("select * from simpleusers", new UserRowMapper());
    //    }


}
