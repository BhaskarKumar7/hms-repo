package com.boot.hms.entity;

import com.boot.hms.constants.AppConstants;
import com.boot.hms.enums.UserRoleEnum;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(schema = AppConstants.DB_SCHEMA)
public class UserDepartment {

	@Id
	@SequenceGenerator(sequenceName = "seq_userdept",initialValue = 1,allocationSize = 1,
	schema = AppConstants.DB_SCHEMA,name = "userdept_generator")
	@GeneratedValue(strategy = GenerationType.SEQUENCE,generator = "userdept_generator")
	@Column(name = "user_deptid")
	private Integer userDeptId;
	@Column(name = "user_deptname",nullable = false,unique = true)
	private String  userDeptName;
	@Column(name = "user_role",nullable = false)
	@Enumerated(EnumType.STRING)
	private UserRoleEnum userRole;
}
