package egor.online.repository;

import egor.online.entity.AuthorizedUser;
import org.springframework.lang.Nullable;

import java.util.ArrayList;
import java.util.List;

public class AuthorizedUserRepository implements UserRepository {
    List<AuthorizedUser> users = new ArrayList<>();

    @Override
    public AuthorizedUser getUserByLogin(final String login) {
        return users.stream().filter(us->us.getLogin().equals(login)).findFirst().orElse(null);
    }

    @Override
    public boolean addAuthorizedUser(@Nullable AuthorizedUser authorizedUser) {
        if (authorizedUser!=null){
            users.add(authorizedUser);
            return true;
        }
        return false;
    }
}
