package com.study.cafe.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MainController {

	
	@GetMapping("/")
	public String main() {
		System.out.println("관리자 메인페이지");
		return "index";
	}
	
	@GetMapping("/page2")
	public String page2() {
		System.out.println("관리자 메인페이지");
		return "main";
	}
	
	@GetMapping("/page3")
	public String main3() {
		System.out.println("관리자 메인페이지");
		return "index2";
	}
	
	
	
}
