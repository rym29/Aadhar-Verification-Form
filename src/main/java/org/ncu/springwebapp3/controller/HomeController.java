package org.ncu.springwebapp3.controller;

import java.io.IOException;
import java.util.Date;

import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HomeController {

	@RequestMapping(value="/")
	public ModelAndView test(HttpServletResponse response) throws IOException{
		return new ModelAndView("home");
		
	}
	
	@RequestMapping(value="/date-page")
	public String getDate(Model model) {
		Date date=new Date();
		System.out.println("Today's Date Is ="+date);
		model.addAttribute("CurrentDate", date);
		return "date";
	}
}
