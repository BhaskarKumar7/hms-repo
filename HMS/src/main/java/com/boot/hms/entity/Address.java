package com.boot.hms.entity;

import java.time.LocalDateTime;

import com.boot.hms.constants.AppConstants;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(schema = AppConstants.DB_SCHEMA)
public class Address {
	@Id
	@SequenceGenerator(sequenceName = "seq_address",initialValue = 1,allocationSize = 1,
	schema = AppConstants.DB_SCHEMA,name = "address_generator")
	@GeneratedValue(strategy = GenerationType.SEQUENCE,generator = "address_generator")
	@Column(name = "address_id",unique = true )
	private Integer addressId;
	@Column(name = "address_line",unique = true,nullable = false)
	private String addressLine;
	@Column(name = "address_type",nullable = false)
	private String addressType;
	@Column(name = "created_time",nullable = false)
	private LocalDateTime createdTime;
	@Column(name = "door_no",nullable = false)
	private String doorNo;
	@Column(name = "land_mark",nullable = false)
	private String landMark;
	@Column(name = "modified_time",nullable = false)
	private LocalDateTime modifiedTime;
	@Column(name = "pincode",nullable = false)
	private String pincode;
	@ManyToOne(cascade = CascadeType.ALL,fetch = FetchType.LAZY)
	@JoinColumn(name = "city_id",nullable = false)
	private City cityId;
	
}
