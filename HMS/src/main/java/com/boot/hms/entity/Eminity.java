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
public class Eminity {
	
	@Id
	@SequenceGenerator(sequenceName = "seq_eminity",initialValue = 1,allocationSize = 1,
	schema = AppConstants.DB_SCHEMA,name = "eminity_generator")
	@GeneratedValue(strategy = GenerationType.SEQUENCE,generator = "eminity_generator")
	@Column(name = "eminity_id")
	private Integer eminityId;
	@Column(name = "eminity_name",unique = true,nullable = false)
	private String eminityName;
	@Column(name = "eminity_tag",unique = true,nullable = false)
	private String eminityTag;
	
}
