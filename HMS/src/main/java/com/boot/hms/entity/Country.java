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
public class Country {
	@Id
	@SequenceGenerator(sequenceName = "seq_country",initialValue = 1,allocationSize = 1,
	schema = AppConstants.DB_SCHEMA,name = "country_generator")
	@GeneratedValue(strategy = GenerationType.SEQUENCE,generator = "country_generator")
	@Column(name = "country_id")
	private Integer countryId;
	@Column(name = "capital",unique = true,nullable = false)
	private String capital;
	@Column(name = "currency",unique = true,nullable = false)
	private String currency;
	@Column(name = "currency_name",unique = true,nullable = false)
	private String currencyName;
	@Column(name = "currency_symbol",unique = true,nullable = false)
	private String currencySymbol;
	@Column (name = "iso2",unique = true,nullable = false)
	private String iso2;
	@Column(name = "iso3",unique = true,nullable = false)
	private String iso3;
	@Column(name = "name",unique = true,nullable = false)
	private String name;
	@Column(name = "nationality",unique = true,nullable = false)
	private String nationality;
	@Column(name = "numeric_code",unique = true,nullable = false)
	private String numericCode;
	@Column(name = "phone_code",unique = true,nullable = false)
	private String phoneCode;
}
