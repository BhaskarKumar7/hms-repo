package com.boot.hms.service.impl;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.boot.hms.dto.CityDto;
import com.boot.hms.entity.City;
import com.boot.hms.repository.CityRepository;
import com.boot.hms.service.CityService;

@Service
public class CityServiceImpl implements CityService {

	@Autowired
	private CityRepository cityRepo;
	
	
	@Override
	public CityDto readCity(Integer id) {
		CityDto cityDto = null;
		Optional<City> cityOptional = cityRepo.findById(id);
		City  city	= cityOptional.isPresent() ? cityOptional.get():null;
		if(city != null) {
			 cityDto = new CityDto();
			cityDto.setCityId(city.getCityId());
			cityDto.setCityName(city.getName());
			if(city.getState() != null) {
				cityDto.setStateId(city.getState().getStateId());	
			}
		}
		return cityDto;
	}

	@Override
	public List<CityDto> readAllCitiesByStateId(Integer id) {
		 List<City> cityList = cityRepo.findByStateStateId(id);
		 List<CityDto> cityDtoList = new ArrayList<>();
		 for(int i=0;i<cityList.size();i++) {
			 City city = cityList.get(i);
			 CityDto cityDto = new CityDto();
			 cityDto.setCityId(city.getCityId());
			 cityDto.setCityName(city.getName());
			 if(city.getState() != null) {
				 cityDto.setStateId(city.getState().getStateId());	 
			 }
			 cityDtoList.add(cityDto);
		}
		return cityDtoList;
	}

}
