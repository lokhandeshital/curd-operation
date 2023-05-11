package com.bikkadit.curdoperation.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.bikkadit.curdoperation.entity.User;

public interface UserRepository extends JpaRepository<User, Long> {

}
