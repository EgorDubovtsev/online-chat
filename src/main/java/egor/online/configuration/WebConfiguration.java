package egor.online.configuration;

import egor.online.dao.SearchDao;
import egor.online.dao.SearchDaoImpl;
import egor.online.dao.UserDaoImpl;
import egor.online.mapper.AuthorizedUserMapper;
import egor.online.mapper.InterlocutorMapper;
import egor.online.repository.AuthorizedUserRepository;
import egor.online.repository.UserRepository;
import egor.online.service.*;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.core.userdetails.UserDetailsService;

@Configuration
public class WebConfiguration {
    @Bean
    public UserRepository userRepository(){
        return new AuthorizedUserRepository();
    }
    @Bean
    public UserDetailsService userDetailsService(){
        return new UserDetailsServiceMapper();
    }
    @Bean
    UserDaoImpl userDao(){
        return new UserDaoImpl();
    }
    @Bean
    public AuthorizedUserMapper userMapper(){
        return new AuthorizedUserMapper();
    }
    @Bean
    public SimpleUserService simpleUserService(){
        return new UserService();
    }
    @Bean
    public SimpleSearchService searchService(){
        return new SearchService();
    }
    @Bean
    public SearchDao searchDao(){
        return new SearchDaoImpl();
    }
    @Bean
    InterlocutorMapper interlocutorMapper(){
        return new InterlocutorMapper();
    }
}
