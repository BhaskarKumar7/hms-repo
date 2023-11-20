package com.boot.hms.service;

import java.util.List;

import com.boot.hms.dto.CityDto;

public interface CityService {

	public CityDto readCity(Integer id);
	public List<CityDto> readAllCitiesByStateId(Integer id);
}
