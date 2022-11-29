package com.example.controller;

import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import lombok.extern.log4j.Log4j;

@Component
@RequestMapping("/sample/*")
@Log4j
public class SampleController {
//	@RequestMapping("")
//	public String basic() {
//		log.info("==========basic==========");
//		return "a";
//	}

    // 메소드명으로 찾는 것이 아니라
    // RequestMapping() 여기 가로 안에 써준 것을 찾는 것이다.
	@RequestMapping("basic1")
	public void basic2(int age) {
		log.info("=============basic1===========");
		log.info(age);
	}
	
	@GetMapping("basic")
	public void basicGet() {
		log.info("============Get방식으로 요청===========");
	}
	
	@PostMapping("basic") 
	public void basicPost(int age) {
		log.info("=============Post방식으로 요청==========");
		log.info(age);
	}
}
