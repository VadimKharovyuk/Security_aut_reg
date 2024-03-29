package com.example.security_aut_reg;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface UserRepositoty  extends JpaRepository<User,Long> {
    Optional<User> findUserByUserName(String username);
}
