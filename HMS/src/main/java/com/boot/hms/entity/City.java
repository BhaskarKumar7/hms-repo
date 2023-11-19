package com.boot.hms.entity;

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
public class City {
	@Id
	@SequenceGenerator(sequenceName = "seq_state",initialValue = 1,
	allocationSize = 1,schema = AppConstants.DB_SCHEMA,name = "city_generator")
	@GeneratedValue(strategy = GenerationType.SEQUENCE,generator = "city_generator")
	@Column(name = "id")
	private Integer id;
	@Column(name = "name",unique = true,nullable = false)
	private String name;
	@ManyToOne(cascade = CascadeType.ALL,fetch = FetchType.LAZY)
	@JoinColumn(name = "state_id",nullable = false)
	private State stateId;
}
