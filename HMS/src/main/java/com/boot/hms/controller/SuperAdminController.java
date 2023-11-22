package com.boot.hms.controller;

import java.time.Month;
import java.time.Year;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@RequestMapping("/superadmin")
@Controller
public class SuperAdminController {

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
}
