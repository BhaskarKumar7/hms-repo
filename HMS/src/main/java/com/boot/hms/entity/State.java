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
@Table(schema = AppConstants.DB_SCHEMA,name = "state")
public class State {

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE
	,generator = "state_generator")
	@SequenceGenerator(sequenceName = "seq_state",
	initialValue = 1,schema = AppConstants.DB_SCHEMA,name = "state_generator",allocationSize = 1)
	@Column(name = "id")
	private Integer stateId;
	@Column(name = "name",unique = true,nullable = false)
	private String  name;
	@Column(name = "state_code",unique = true,nullable = false)
	private String stateCode;
	@ManyToOne(cascade = CascadeType.ALL,fetch = FetchType.LAZY)
	@JoinColumn(name = "country_id",nullable = false)
	private Country country;
}
