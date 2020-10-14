package egor.online.dao;

import egor.online.entity.User;
import egor.online.mapper.AuthorizedUserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;
@Component
public class UserDaoImpl implements UserDao {
    @Autowired
    JdbcTemplate jdbcTemplate;
    @Autowired
    AuthorizedUserMapper userMapper;
    @Override
    public boolean saveUser(User user) {
        String savePersonalDataSql = "INSERT INTO user_personal_data values(?,?,?)";
        String saveLoginDataSql = "INSERT INTO user_login_data values(?,?)";
        try{
            jdbcTemplate.update(savePersonalDataSql, user.getLogin(), user.getAge(), user.getName());
            jdbcTemplate.update(saveLoginDataSql, user.getLogin(),user.getPassword());
        }catch (Exception ex){
            return false;
        }
        return true;
    }

    @Override
    public void getUserByLogin(String login) {//TODO:Add mapper realization
        String getUserByLoginSql = "SELECT * FROM user_personal_data INNER JOIN user_login_data on user_personal_data.login=user_login_data.login where login=?";
//        jdbcTemplate.queryForObject(getUserByLoginSql,login,userMapper);
    }
}
