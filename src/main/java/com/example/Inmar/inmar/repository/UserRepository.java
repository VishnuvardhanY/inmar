package com.example.Inmar.inmar.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.Inmar.inmar.entity.User;

public interface UserRepository extends JpaRepository<User,Integer> {
    User findByUserName(String username);
}
