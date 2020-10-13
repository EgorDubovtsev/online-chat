package egor.online.configuration;

import egor.online.dao.UserDaoImpl;
import egor.online.repository.AuthorizedUserRepository;
import egor.online.repository.UserRepository;
import egor.online.service.UserDetailsServiceMapper;
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
}
