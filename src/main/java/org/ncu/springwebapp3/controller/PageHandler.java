package org.ncu.springwebapp3.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class PageHandler {
	//input form will show the input form
	@RequestMapping(value="/input-form")
	public String showInputForm() {
		return "input-form";
	}
	//Process-form will process the data
	@RequestMapping("/process")
	public String processInputForm() {
		return "process-form";
	}
	
}
