package egor.online.dao;

import egor.online.entity.User;

public interface UserDao {
    boolean saveUser(User user);
    User getUserByLogin(String login);

}
