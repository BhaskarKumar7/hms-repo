package com.boot.hms.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.boot.hms.entity.UserAccount;


public interface UserAccountRepository extends JpaRepository<UserAccount, Integer> {

	UserAccount findByUserEmail(String userEmail);
	UserAccount findByUserMobileNo(String userMobileNo);
	UserAccount findByUserName(String userName);
}
