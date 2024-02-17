package com.boot.hms.dto;

import java.io.Serializable;

import lombok.Data;

@Data
public class UserDepartmentDto implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -747751958433041490L;
	private Integer userDeptId;
	private String userDeptName;
	private String userRole;

}
