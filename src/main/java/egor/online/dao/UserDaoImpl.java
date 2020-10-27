package egor.online.dao;

import egor.online.entity.User;
import egor.online.mapper.AuthorizedUserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

@Component
public class UserDaoImpl implements UserDao {
    @Autowired
    private JdbcTemplate jdbcTemplate;
    @Autowired
    private AuthorizedUserMapper userMapper;

    @Override
    public boolean saveUser(User user) {
        String savePersonalDataSql = "INSERT INTO user_personal_data values(?,?,?)";
        String saveLoginDataSql = "INSERT INTO user_login_data values(?,?)";
        try {
            jdbcTemplate.update(savePersonalDataSql, user.getLogin(), user.getAge(), user.getName());
            jdbcTemplate.update(saveLoginDataSql, user.getLogin(), user.getPassword());
        } catch (Exception ex) {
            return false;
        }
        return true;
    }

    @Override
    public User getUserByLogin(String login) {
        String getUserByLoginSql = "SELECT * FROM user_personal_data INNER JOIN user_login_data on user_personal_data.login=user_login_data.login where user_login_data.login=?";
        try{
            return jdbcTemplate.queryForObject(getUserByLoginSql, userMapper, login);
        }catch (Exception ex){
            ex.printStackTrace();
            return null;
        }
    }
}
