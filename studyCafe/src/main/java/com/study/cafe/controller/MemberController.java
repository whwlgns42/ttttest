package com.study.cafe.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MemberController {

	@GetMapping("/memberList")
	public String memberPage() {
		System.out.println("회원 페이지");
		
		return "memberForm";
	}
}
