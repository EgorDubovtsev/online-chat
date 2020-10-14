package egor.online.mapper;

import egor.online.entity.AuthorizedUser;
import egor.online.entity.User;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class AuthorizedUserMapper implements RowMapper<User> {
    @Override
    public User mapRow(ResultSet resultSet, int i) throws SQLException {
        AuthorizedUser user = new AuthorizedUser();
        user.setName(resultSet.getString("personal_name"));
        user.setAge(resultSet.getInt("age"));
        user.setLogin(resultSet.getString("login"));
        user.setPassword(resultSet.getString("personal_password"));
        return user;
    }
}
