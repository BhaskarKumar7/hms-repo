package com.boot.hms.entity;

import com.boot.hms.constants.AppConstants;
import com.boot.hms.enums.GenderEnum;
import com.boot.hms.enums.UserRoleEnum;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToOne;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(schema = AppConstants.DB_SCHEMA)
public class UserAccount {
	
	@Id
	@SequenceGenerator(sequenceName = "seq_user",initialValue = 1,allocationSize = 1,
	schema = AppConstants.DB_SCHEMA,name = "user_generator")
	@GeneratedValue(strategy = GenerationType.SEQUENCE,generator = "user_generator")
	@Column(name = "user_id")
	private Integer userId;
	@Column(name = "user_name",nullable = false,unique = true)
	private String userName;
	@Column(name = "user_password",nullable = false,unique = true)
	private String userPassword;
	@Column(name = "user_email",nullable = false,unique = true)
	private String userEmail;
	@Column(name = "user_dob",nullable = false)
	private String userDob;
	@Column(name = "user_mobile_no",nullable = false,unique = true)
	private String userMobileNo;
	@Column(name = "user_gender",nullable = false)
	@Enumerated(EnumType.STRING)
	private GenderEnum userGender;
	@OneToOne(cascade = CascadeType.ALL,fetch = FetchType.LAZY)
	@JoinColumn(name = "user_address_id",nullable = false)
	private Address userAddress;
	@Column(name = "user_role",nullable = false)
	@Enumerated(EnumType.STRING)
	private UserRoleEnum userRole;
	@ManyToOne(cascade = CascadeType.ALL,fetch = FetchType.LAZY)
	@JoinColumn(name = "user_dept_id",nullable = false)
	private UserDepartment userDepartment;
}
