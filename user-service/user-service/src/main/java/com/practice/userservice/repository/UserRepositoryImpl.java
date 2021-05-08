package com.practice.userservice.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.practice.userservice.entity.User;

@Repository
public interface UserRepositoryImpl extends JpaRepository<User, Long> {

	User findByUserId(long userId);

}
