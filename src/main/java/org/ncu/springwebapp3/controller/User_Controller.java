package org.ncu.springwebapp3.controller;

import javax.validation.Valid;

import org.ncu.springwebapp3.entity.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(value = "/user")
public class User_Controller {

	// create a ModelAttribute method to load the domain objective
	@ModelAttribute("user")
	public User getUserEntity() {
		return new User();
	}

	// generate or show the input form and u should process the input form
	@RequestMapping(value = "/register")
	public String showRegistrationForm() {
		return "register-form";
	}

	@RequestMapping(value = "/display")

	public String displayInputForm(@Valid @ModelAttribute("user") User user, BindingResult bindingResult, Model model) {
		String name = user.getUsername();
		System.out.println("User Details: " + user.toString());
		model.addAttribute("updatedname", name);

//		// validation for name
//		String name_error = "Name should not have numbers and special characters";
//		int count_name = 0;
//
//		for (int i = 0; i < name.length(); i++) {
//			if (!Character.isLetter(name.charAt(i)) && !Character.isWhitespace(name.charAt(i))) {
//				count_name++;
//			}
//		}
//
//		// When there is no special character encountered
//		if (count_name != 0) {
//			System.out.println(name_error);
//			return "register-form";
//		}
//
//		// validation for password
//		String s = user.getUserPass();
//		String pass_error = "Please add special character in password";
//		int count = 0;
//
//		for (int i = 0; i < s.length(); i++) {
//
//			// Checking the character for not being a
//			// letter,digit or space
//			if (Character.isDigit(s.charAt(i)) && Character.isLetter(s.charAt(i))
//					&& Character.isWhitespace(s.charAt(i))) {
//				// Incrementing the countr for spl
//				// characters by unity
//				count++;
//			}
//		}
//
//		// When there is no special character encountered
//		if (count != 0) {
//			System.out.println(pass_error);
//			return "register-form";
//		}
//		String s = user.getUserPass();
//		String cpass = user.getUserCPass();
//		String conpass_error = "Password does not match with confirmed password";
//		if (!(s.equals(cpass))) {
//			System.out.println(conpass_error);
//			return "register-form";
//		}
//
//		// validation for mail
//		String mail = user.getEmailId();
//		if (!mail.contains("@")) {
//			System.out.println("Mail should contain @ symbol");
//			return "register-form";
//		}

//		return "display-form";
		if (bindingResult.hasErrors()) {
			return "register-form";
		} else {
			return "display-form";
		}
	}
}