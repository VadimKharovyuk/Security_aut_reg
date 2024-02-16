package com.example.security_aut_reg;

import lombok.AllArgsConstructor;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class UserService  implements UserDetailsService {
    private final UserRepositoty repositoty;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        User user = repositoty.findUserByUserName(username).orElseThrow(()-> new UsernameNotFoundException("Пользователь не найдет с  именем "+username));
        return UserDerailsImplement.build(user);
    }
}
