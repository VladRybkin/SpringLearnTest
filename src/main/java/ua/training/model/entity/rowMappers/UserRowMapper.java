package ua.training.model.entity.rowMappers;

import org.springframework.jdbc.core.RowMapper;
import ua.training.model.entity.SimpleUser;
import ua.training.model.entity.User;

import java.sql.ResultSet;
import java.sql.SQLException;

public class UserRowMapper implements RowMapper<SimpleUser> {

    @Override
    public SimpleUser mapRow(ResultSet resultSet, int i) throws SQLException {
        SimpleUser user = new SimpleUser();
        user.setId(resultSet.getInt("id"));
        user.setName(resultSet.getString("username"));
        return user;
    }
}
