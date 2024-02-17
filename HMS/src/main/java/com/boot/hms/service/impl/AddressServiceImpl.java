package com.boot.hms.service.impl;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.boot.hms.dto.AddressDto;
import com.boot.hms.dto.ServerResponseDto;
import com.boot.hms.entity.Address;
import com.boot.hms.entity.City;
import com.boot.hms.enums.AddressTypeEnum;
import com.boot.hms.repository.AddressRepository;
import com.boot.hms.repository.CityRepository;
import com.boot.hms.service.AddressService;

@Service
public class AddressServiceImpl implements AddressService {

	@Autowired
	private AddressRepository addressRepo;
	@Autowired
	private CityRepository cityRepo;
	
	@Override
	public ServerResponseDto createAddress(AddressDto addressDto) {
			Address address = new Address();
			
			address.setAddressLine(addressDto.getAddressLine());
			address.setAddressType(AddressTypeEnum.valueOf(addressDto.getAddressType()));
			address.setDoorNo(addressDto.getDoorNo());
			address.setLandMark(addressDto.getLandmark());
			address.setPincode(addressDto.getPincode());
			Optional<City> cityOptional =cityRepo.findById(addressDto.getCityId());
			City city = cityOptional.isPresent()? cityOptional.get() : null;
			if(city != null) {
				address.setCity(city);
			}
			  addressRepo.save(address);
			
		return null;
	}

}
