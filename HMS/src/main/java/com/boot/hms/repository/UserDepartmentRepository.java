package com.boot.hms.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.boot.hms.entity.UserDepartment;

public interface UserDepartmentRepository extends JpaRepository<UserDepartment, Integer> {

	public UserDepartment findByUserDeptName(String userDeptName);
}
