package egor.online.dao;

import egor.online.entity.Chat;

public interface ChatDao {
    Chat getChatByLogins(String firstLogin,String secondLogin);
    boolean createChat(String firstLogin, String secondLogin);
}
