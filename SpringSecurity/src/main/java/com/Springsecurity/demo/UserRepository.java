package com.Springsecurity.demo;

import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<UserModel,Integer> {
	UserModel findByUserName(String username);

}
