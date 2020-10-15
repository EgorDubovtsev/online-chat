package egor.online.service;

import egor.online.dao.UserDao;
import egor.online.entity.User;
import org.springframework.beans.factory.annotation.Autowired;

public interface SimpleUserService {
    User getUserByLogin(String login);
}
