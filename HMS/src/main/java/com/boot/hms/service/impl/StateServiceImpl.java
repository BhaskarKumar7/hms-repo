package com.boot.hms.service.impl;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.boot.hms.dto.StateDto;
import com.boot.hms.entity.State;
import com.boot.hms.repository.StateRepository;
import com.boot.hms.service.StateService;

@Service
public class StateServiceImpl implements StateService {
	
	@Autowired
	private StateRepository stateRepo;
	@Override
	public StateDto readState(Integer id) {
		StateDto stateDto = null;
		Optional<State> stateOptional = stateRepo.findById(id);
	State state =stateOptional.isPresent()? stateOptional.get():null;
	if(state !=null) {
		stateDto = new StateDto();
		stateDto.setStateId(state.getStateId());
		stateDto.setStateName(state.getName());
		stateDto.setStateCode(state.getStateCode());
		if(null != state.getCountry())	{
			stateDto.setCountryId(state.getCountry().getCountryId());	
		}
	}
	return stateDto;
	}

	@Override
	public List<StateDto> readAllStatesByCountryId(Integer id) {
		 List<State> stateList =stateRepo.findByCountryCountryId(id); 
		 List<StateDto> stateDtoList = new ArrayList<>();
		 for(int i=0;i<stateList.size();i++) {
			 State state = stateList.get(i);
			 if(state != null) {
				 StateDto stateDto = new StateDto();
				 stateDto.setStateId(state.getStateId());
				 stateDto.setStateName(state.getName());
				 stateDto.setStateCode(state.getStateCode());
				 if(state.getCountry() != null) {
					 stateDto.setCountryId(state.getCountry().getCountryId());	 
				 }
				
				 stateDtoList.add(stateDto);
			 }
		 }
		return stateDtoList;
	}

}
