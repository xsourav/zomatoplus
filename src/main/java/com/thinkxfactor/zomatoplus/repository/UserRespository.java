package com.thinkxfactor.zomatoplus.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.thinkxfactor.zomatoplus.models.User;

public interface UserRespository extends JpaRepository<User, Long> {

	User findByUnameAndPassword(String name,String password);
}
