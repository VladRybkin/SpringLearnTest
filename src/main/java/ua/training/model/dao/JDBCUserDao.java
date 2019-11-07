package ua.training.model.dao;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.ResultSetExtractor;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import ua.training.model.entity.User;
import ua.training.model.entity.rowMappers.UserRowMapper;


import javax.sql.DataSource;
import java.sql.ResultSet;
import java.util.List;


public class JDBCUserDao {

    private JdbcTemplate jdbcTemplate;

    private DataSource dataSource;


    public JDBCUserDao() {
    }


    public void insertUser(int id, String name) {
        jdbcTemplate.execute(String.format("INSERT INTO `springjdbc`.`users`(`user_id`, `user_name`) VALUES(%d, '%s');", id, name));

    }

    public List<User> getUsers() {
        return jdbcTemplate.query("select * from users", new UserRowMapper());
    }


    public User getUserById(int id) {
        return jdbcTemplate.queryForObject("select * from users", new UserRowMapper());
    }

    public JdbcTemplate getJdbcTemplate() {
        return jdbcTemplate;
    }

    public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    public DataSource getDataSource() {
        return dataSource;
    }

    public void setDataSource(DataSource dataSource) {
        this.dataSource = dataSource;
    }
}
