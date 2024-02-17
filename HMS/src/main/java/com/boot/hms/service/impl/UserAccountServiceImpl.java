package com.boot.hms.service.impl;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.boot.hms.dto.AddressDto;
import com.boot.hms.dto.ServerResponseDto;
import com.boot.hms.dto.UserAccountDto;
import com.boot.hms.dto.UserDepartmentDto;
import com.boot.hms.entity.Address;
import com.boot.hms.entity.UserAccount;
import com.boot.hms.entity.UserDepartment;
import com.boot.hms.enums.AddressTypeEnum;
import com.boot.hms.enums.GenderEnum;
import com.boot.hms.enums.UserRoleEnum;
import com.boot.hms.repository.AddressRepository;
import com.boot.hms.repository.CityRepository;
import com.boot.hms.repository.UserAccountRepository;
import com.boot.hms.repository.UserDepartmentRepository;
import com.boot.hms.service.UserAccountService;
import com.boot.hms.util.BcryptUtility;

import lombok.extern.slf4j.Slf4j;

@Service
@Slf4j
public class UserAccountServiceImpl implements UserAccountService {
	
	
	private UserAccountRepository userAccountRepo;
	
	private AddressRepository addressRepo;
	
	private CityRepository cityRepo;
	
	private UserDepartmentRepository userDRepo;
	
	public UserAccountServiceImpl( UserAccountRepository userAccountRepo,AddressRepository addressRepo,CityRepository cityRepo,
			UserDepartmentRepository userDRepo) {
		this.userAccountRepo = userAccountRepo;
		this.addressRepo = addressRepo;
		this.cityRepo = cityRepo;
		this.userDRepo = userDRepo;
	}
	
	@Override
	@Transactional
	public ServerResponseDto createUserAccount(UserAccountDto userAccountDto) {
		log.info("<======In UserAccountServiceImpl.createUserAccount=====>");
		//populating address entity
				Address address  = new Address();
				AddressDto addressDto = userAccountDto.getUserAddress();
				address.setCity(cityRepo.findById(addressDto.getCityId())
										.get());
				address.setAddressLine(addressDto.getAddressLine());
				address.setAddressType(AddressTypeEnum.valueOf(addressDto.getAddressType()));
				address.setDoorNo(addressDto.getDoorNo());
				address.setLandMark(addressDto.getLandmark());
				address.setPincode(addressDto.getPincode());
				address = addressRepo.save(address);
			
		//preparing user department entity	
				UserDepartmentDto userDepartmentDto = userAccountDto.getUserDepartment();
		     	UserDepartment	 userDepartment = userDRepo.findByUserDeptName(userDepartmentDto.getUserDeptName());
				
		UserAccount userAccount = new UserAccount();
		userAccount.setUserName(userAccountDto.getUserName());
		userAccount.setUserPassword(BcryptUtility.generateHash(userAccountDto.getUserPassword()));
		userAccount.setUserEmail(userAccountDto.getUserEmail());
		userAccount.setUserDob(userAccountDto.getUserDay()+"-"+
		userAccountDto.getUserMonth()+"-"+
				userAccountDto.getUserYear());
		userAccount.setUserGender(GenderEnum.valueOf(userAccountDto.getUserGender()));
		userAccount.setUserMobileNo(userAccountDto.getUserMobileNo());
		userAccount.setUserRole(UserRoleEnum.valueOf(userAccountDto.getUserRole()));
		userAccount.setUserAddress(address);
		userAccount.setUserDepartment(userDepartment);
		userAccountRepo.save(userAccount);
		
		ServerResponseDto serverResponseDto = new ServerResponseDto();
		serverResponseDto.setResponseCode(200);
		serverResponseDto.setResponseMessage("User Saved Successfully");
		serverResponseDto.setResponseStatus("SUCCESS");
		return serverResponseDto;
	}

}
