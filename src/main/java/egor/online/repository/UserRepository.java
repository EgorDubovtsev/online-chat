package egor.online.repository;

import egor.online.entity.AuthorizedUser;

public interface UserRepository {
    AuthorizedUser getUserByLogin(String login);
    boolean addAuthorizedUser(AuthorizedUser authorizedUser);
}
