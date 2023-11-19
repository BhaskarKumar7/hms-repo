package com.boot.hms.entity;

import java.time.LocalDateTime;
import java.util.List;

import com.boot.hms.constants.AppConstants;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(schema = AppConstants.DB_SCHEMA)
public class Hotel {
	@Id
	@SequenceGenerator(sequenceName = "seq_hotel",initialValue = 1,allocationSize = 1,
			schema = AppConstants.DB_SCHEMA,name = "hotel_generator")
	@GeneratedValue(strategy = GenerationType.AUTO,generator = "hotel_generator")
	@Column(name = "hotel_id")
	private Integer hotelId;
	@Column(name = "created_time",nullable = false)
	private LocalDateTime createdTime;
	@Column(name = "hotel_name",unique = true,nullable = false)
	private String hotelName;
	@Column(name = "hotel_phone_number",unique = true,nullable = false)
	private String hotelPhoneNumber;
	@Column(name = "modified_time",nullable = false)
	private LocalDateTime modifiedTime;
	@OneToOne(cascade = CascadeType.ALL,fetch = FetchType.LAZY)
	@JoinColumn(name = "address_id",nullable = false)
	private Address addressId;
	@OneToMany(cascade = CascadeType.ALL
			,fetch = FetchType.LAZY,mappedBy = "hotelId")
	private List<Room> rooms;
	@OneToMany(fetch = FetchType.LAZY,cascade = CascadeType.ALL)
	@JoinTable(name = "hotel_eminity",
				joinColumns = @JoinColumn(name="hotel_id"),
				inverseJoinColumns = @JoinColumn(name="eminity_id")
	,schema = AppConstants.DB_SCHEMA)
	private List<Eminity> eminities;
	
}
