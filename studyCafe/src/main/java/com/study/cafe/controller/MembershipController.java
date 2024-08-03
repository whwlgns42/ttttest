package com.study.cafe.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MembershipController {
	
	@GetMapping("/membershipList")
	public String membershipPage() {
		System.out.println("회비관리 페이지");
		return "membershipForm";
	}

}
