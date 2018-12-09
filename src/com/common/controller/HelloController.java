package com.common.controller;

import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HelloController {

	@RequestMapping("/welcome/{userName}/{countryName}")
	public ModelAndView helloWorld(@PathVariable Map<String, String> pathVars) {
		String name = pathVars.get("userName");
		String country = pathVars.get("countryName");
		ModelAndView model = new ModelAndView("HelloPage");
		model.addObject("welcomeMessage", "Hi " + name + " You are from "
				+ country);
		return model;

	}

}
