package com.study.cafe.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class AttendanceController {

	
	
	@GetMapping("/attendanceList")
	public String attendancePage() {
		System.out.println("출석페이지");
		return "attendanceForm";
	}
}
