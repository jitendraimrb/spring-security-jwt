package com.learn.json.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.learn.json.entity.User;

public interface UserRepository extends JpaRepository<User,Integer> {
    User findByUserName(String username);
}
