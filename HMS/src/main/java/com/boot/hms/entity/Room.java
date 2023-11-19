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
import jakarta.persistence.OneToOne;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(schema = AppConstants.DB_SCHEMA)
public class Room {
	
	@Id
	@SequenceGenerator(sequenceName = "seq_room",initialValue = 1,allocationSize = 1,
	schema = AppConstants.DB_SCHEMA,name = "roomNo_generator")
	@GeneratedValue(strategy = GenerationType.SEQUENCE,generator = "roomNo_generator")
	@Column(name = "room_id")
	 private Integer roomId;
	@Column(name = "created_time",nullable = false)
	 private LocalDateTime createdTime;
	@Column(name = "modified_time",nullable = false)
	 private LocalDateTime modifiedTime;
	@Column(name = "no_of_people",nullable = false)
	 private int noOfPeople;
	@Column(name = "room_number",unique = true,nullable = false)
	 private String roomNumber;
	 @ManyToOne(fetch = FetchType.LAZY)
	 @JoinColumn(name = "hotel_id",nullable = false)
	 private Hotel hotelId;
	 @OneToOne(cascade = CascadeType.ALL,fetch = FetchType.LAZY)
	 @JoinColumn(name = "room_type_id",nullable = false)
	 private RoomType roomTypeId;
	 
}
