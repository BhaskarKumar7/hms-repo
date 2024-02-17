package com.boot.hms.controller;

import java.time.Month;
import java.time.Year;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.util.CollectionUtils;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.boot.hms.dto.CityDto;
import com.boot.hms.dto.CountryDto;
import com.boot.hms.dto.StateDto;
import com.boot.hms.dto.UserAccountDto;
import com.boot.hms.service.CityService;
import com.boot.hms.service.CountryService;
import com.boot.hms.service.StateService;

import lombok.extern.slf4j.Slf4j;

@RequestMapping("/superadmin")
@Controller

public class SuperAdminController {

	@Autowired
	private CountryService countryService;
	@Autowired
	private StateService stateService;
	@Autowired
	private CityService cityService;
	
	@GetMapping("/login")
	public String getLoginPage() {
		return "superadmin/login";
	}

	@GetMapping("/home")
	public String getSuperAdminHome() {
		return "superadmin/home";
	}

	@GetMapping("/createAdmin")
	public String createAdmin() {
		return "superadmin/createAdmin";
	}

	@GetMapping("/fetchYears")
	@ResponseBody
	public Map<String, List<String>> fetchYears() {
		Map<String, List<String>> responseMap = new HashMap<>();
		List<String> yearsList = new ArrayList<>();
		int currentYear = Year.now().getValue();
		int firstYear = 1920;
		for (int i = firstYear; i <= currentYear; i++) {
			yearsList.add(i + "");
		}
		responseMap.put("years", yearsList);
		return responseMap;
	}

	@GetMapping("/fetchMonths")
	@ResponseBody
	public Map<String, List<String>> fetchMonths() {
		Map<String, List<String>> responseMap = new HashMap<>();
		Month[] months = Month.values();
		List<String> monthsList = new ArrayList<>();
		for (int i = 0; i < months.length; i++) {
			monthsList.add(months[i].toString());
		}
		responseMap.put("months", monthsList);
		return responseMap;
	}

	@PostMapping("/fetchDays")
	@ResponseBody
	public Map<String, List<String>> fetchDays(@RequestBody Map<String, String> reqPayload) {
		Map<String, List<String>> responseMap = new HashMap<>();
		int year = Integer.parseInt(reqPayload.get("year"));
		String month = reqPayload.get("month");
		List<String> daysList = new ArrayList<>();
		if (Month.FEBRUARY == Month.valueOf(month)) {
			if (year % 4 == 0) {
				for (int i = 1; i <= 29; i++) {
					daysList.add(i + "");
				}
			} else {
				for (int i = 1; i <= 28; i++) {
					daysList.add(i + "");
				}
			}
		} else {
			for (int i = 1; i <= Month.valueOf(month).maxLength(); i++) {
				daysList.add(i + "");
			}
		}
		responseMap.put("days", daysList);
		return responseMap;
	}
	
	@GetMapping("/fetchCountries")
	@ResponseBody
	public Map<String, List<CountryDto>> fetchCountries(){
		Map<String, List<CountryDto>> responseMap = new HashMap<>();
		List<CountryDto> dtoList = countryService.readAllCountries();
		responseMap.put("countries", dtoList);
		return responseMap;
	}
	
	@PostMapping("/fetchStates")
	public ResponseEntity<?> fetchStates(@RequestBody Map<String, Integer> reqPayload){
		Map<String, List<StateDto>> responseMap = new HashMap<>();
		List<StateDto> dtoList =stateService.readAllStatesByCountryId(reqPayload.get("countryId"));
		if(CollectionUtils.isEmpty(dtoList))	{
			return new ResponseEntity<>("We are sorry, no states found for this country!", HttpStatus.BAD_REQUEST);
		}else	{
			responseMap.put("states", dtoList);
			return new ResponseEntity<>(responseMap, HttpStatus.OK);
		}
	}
	
	@PostMapping("/fetchCities")
	public ResponseEntity<?> fetchCities(@RequestBody Map<String, Integer> reqPayload){
		Map<String, List<CityDto>> responseMap = new HashMap<>();
		List<CityDto> dtoList = cityService.readAllCitiesByStateId(reqPayload.get("stateId"));
		if(CollectionUtils.isEmpty(dtoList)) {
			return new  ResponseEntity<>("We are Sorry,no cities found for this state",HttpStatus.BAD_REQUEST);
		}else {
			responseMap.put("cities", dtoList);
			return new  ResponseEntity<>(responseMap,HttpStatus.OK);
		}
	}
	
	@PostMapping("/saveAdmin")
	public ResponseEntity<?> saveAdmin(@RequestBody UserAccountDto reqPayload){
		System.out.println("===================saving admin details=======================");
		System.out.println("req details->"+reqPayload.toString());
		Map<String, String> respMap = new HashMap<>();
		respMap.put("Message", "Saved Admin successfully...");
		return  new ResponseEntity<>(respMap,HttpStatus.OK);
		
	}
}
