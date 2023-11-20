package com.boot.hms.service;

import com.boot.hms.dto.CountryDto;
import com.boot.hms.dto.ServerResponseDto;

public interface CountryService	{
	
	public ServerResponseDto createCountry(CountryDto countryDto );
	public ServerResponseDto updateCountry(CountryDto countryDto);
	public CountryDto readCountry(Integer id);
	public ServerResponseDto deleteCountry(CountryDto countryDto);
	public java.util.List<CountryDto> readAllCountries();
}
