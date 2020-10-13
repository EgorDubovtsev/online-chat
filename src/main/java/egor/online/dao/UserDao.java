package egor.online.dao;

import egor.online.entity.User;

public interface UserDao {
    boolean saveUser(User user);
    void getUserByLogin(String login);

}
