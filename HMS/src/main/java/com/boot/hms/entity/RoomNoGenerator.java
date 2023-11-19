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
public class RoomNoGenerator {
	@Id
	@SequenceGenerator(sequenceName = "seq_room_no",initialValue = 1,allocationSize = 1,
	schema = AppConstants.DB_SCHEMA,name = "roomNoGen_generator")
	@GeneratedValue(strategy = GenerationType.SEQUENCE,generator = "roomNoGen_generator")
	@Column(name = "room_no_gen_id")
	private Integer roomNoGenId;
	@Column(name = "created_time",nullable = false)
	private LocalDateTime createdTime;
	@ManyToOne(cascade = CascadeType.ALL,fetch = FetchType.LAZY)
	@JoinColumn(name = "hotel_id")
	private Hotel hotelId;
	@Column(name = "modified_time",nullable = false)
	private LocalDateTime modifiedTime;
	@Column(name = "room_no_seq",nullable = false)
	private Integer roomNoSeq;
	@OneToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "room_type_id",nullable = false)
	private RoomType roomTypeId;
}
