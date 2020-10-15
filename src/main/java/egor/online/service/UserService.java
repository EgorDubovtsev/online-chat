package egor.online.service;

import egor.online.dao.UserDao;
import egor.online.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class UserService implements SimpleUserService {
    @Autowired
    UserDao userDao;

    @Override
    public User getUserByLogin(String login) {

        return userDao.getUserByLogin(login);
    }
}
