package com.boot.hms.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("/superadmin")
@Controller
public class SuperAdminController {

	@GetMapping("/home")
	public String getSuperAdminHome() {
		return "superadmin/home";
	}
}
