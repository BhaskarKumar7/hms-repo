package com.boot.hms.service;

import java.util.List;

import com.boot.hms.dto.StateDto;

public interface StateService {

	public StateDto readState(Integer id);
	public List<StateDto> readAllStatesByCountryId(Integer id); 
}
