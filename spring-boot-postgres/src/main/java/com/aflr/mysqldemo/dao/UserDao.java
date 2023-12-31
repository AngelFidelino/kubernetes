package com.aflr.mysqldemo.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.aflr.mysqldemo.entity.User;
@Repository
public interface UserDao extends JpaRepository<User, Integer>{

}