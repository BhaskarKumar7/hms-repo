package com.boot.hms.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("/staff")
@Controller
public class StaffController {

	@GetMapping("/login")
	public String getStaffHome() {
		return "staff/login";
	}
}
