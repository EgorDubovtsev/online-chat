package egor.online.service;

import egor.online.dao.UserDao;
import egor.online.entity.AuthorizedUser;
import egor.online.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.Set;


@Service
public class UserDetailsServiceMapper implements UserDetailsService {
  @Autowired
  SimpleUserService userService;
  @Override
  public UserDetails loadUserByUsername(String login) throws UsernameNotFoundException {

    AuthorizedUser authorizedUserDto = (AuthorizedUser) userService.getUserByLogin(login);
    Set<GrantedAuthority> roles = new HashSet<>();
    roles.add(new SimpleGrantedAuthority("User"));
    System.out.println(authorizedUserDto.toString());
    return new User(
        authorizedUserDto.getLogin(),
        authorizedUserDto.getPassword(),
        roles
    );
  }

}
