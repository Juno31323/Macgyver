package com.example.demo.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.user.User;

public interface UserRepository extends JpaRepository<User, Long> {
    Optional<User> findByEmail(String email);
    Optional<User> findByUniqueIdentifier(String uniqueIdentifier);
    Boolean existsByEmail(String email);
    Boolean existsByUniqueIdentifier(String uniqueIdentifier);
}
