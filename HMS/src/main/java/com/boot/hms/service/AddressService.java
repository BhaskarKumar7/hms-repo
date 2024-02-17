package com.boot.hms.service;

import com.boot.hms.dto.AddressDto;
import com.boot.hms.dto.ServerResponseDto;

public interface AddressService {

	public ServerResponseDto createAddress(AddressDto addressDto);
}
