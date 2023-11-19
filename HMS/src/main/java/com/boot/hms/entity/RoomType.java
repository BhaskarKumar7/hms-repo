package com.boot.hms.entity;

import com.boot.hms.constants.AppConstants;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(schema = AppConstants.DB_SCHEMA)
public class RoomType {
	@Id
	@SequenceGenerator(sequenceName = "seq_roomtype",initialValue = 1,allocationSize = 1,
	schema = AppConstants.DB_SCHEMA,name = "roomtype_generator")
	@GeneratedValue(strategy = GenerationType.SEQUENCE,generator = "roomtype_generator")
	@Column(name = "room_type_id")
	private Integer roomTypeId;
	@Column(name = "no_of_beds",nullable = false)
	private int  noOfBeds;
	@Column(name = "prefix",unique = true,nullable = false)
	private String prefix;
	@Column(name = "room_type_name",unique = true,nullable = false)
	private String roomTypeName;
}
