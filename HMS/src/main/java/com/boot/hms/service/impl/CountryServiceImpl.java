package com.boot.hms.service.impl;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.boot.hms.dto.CountryDto;
import com.boot.hms.dto.ServerResponseDto;
import com.boot.hms.entity.Country;
import com.boot.hms.repository.CountryRepository;
import com.boot.hms.service.CountryService;

@Service
public class CountryServiceImpl implements CountryService {
	
	@Autowired
	private CountryRepository countryRepo;

	@Override
	public ServerResponseDto createCountry(CountryDto countryDto) {
		//to do
		return null;
	}

	@Override
	public ServerResponseDto updateCountry(CountryDto countryDto) {
		// TODO Auto-generated method stub
		return null;
	}



	@Override
	public ServerResponseDto deleteCountry(CountryDto countryDto) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public CountryDto readCountry(Integer id) {
		CountryDto countryDto = null;
		Optional<Country> countryOptional = countryRepo.findById(id);
		Country country = countryOptional.isPresent() ? countryOptional.get() : null;
		if(country != null) {
			countryDto = new  CountryDto();
			countryDto.setCountryName(country.getName());
			countryDto.setCountryCapital(country.getCapital());
			countryDto.setCountryId(country.getCountryId());
		}
		return countryDto;
	}

	@Override
	public List<CountryDto> readAllCountries() {
		 List<Country> countriesList = countryRepo.findAll();
		 List<CountryDto> countryDtoList = new ArrayList<>();
		 for(int i =0;i<countriesList.size();i++) {
			Country country = countriesList.get(i); 
			  if(country != null) {
				 CountryDto countryDto = new CountryDto();
				 countryDto.setCountryCapital(country.getCapital());
				 countryDto.setCountryName(country.getName());
				 countryDto.setCountryId(country.getCountryId());
				 
				 countryDtoList.add(countryDto);
			  }
		}
		return countryDtoList;
	}

}
