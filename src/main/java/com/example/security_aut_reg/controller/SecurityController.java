package com.example.security_aut_reg.controller;

import com.example.security_aut_reg.UserRepositoty;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/aut")
public class SecurityController {
    private UserRepositoty repositoty;
    private PasswordEncoder passwordEncoder ;
    private AuthenticationManager authenticationManager ;


//
//    @PostMapping
//    public
}
