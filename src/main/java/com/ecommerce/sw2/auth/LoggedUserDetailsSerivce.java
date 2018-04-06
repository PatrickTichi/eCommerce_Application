package com.ecommerce.sw2.auth;

import com.ecommerce.sw2.Models.Domain.User;
import com.ecommerce.sw2.Models.Services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
public class LoggedUserDetailsSerivce implements UserDetailsService{

    @Autowired
    private UserService userService;

    @Override
    public LoggedUser loadUserByUsername(String email) throws UsernameNotFoundException {
        System.out.println(email);
        User user = userService.getUserByUsername(email).orElseThrow(() -> new UsernameNotFoundException("username not found."));
        return new LoggedUser(user);
    }
}
