package com.kushwah.shanu.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
	public class Home {

	    @GetMapping("/")
	    public String root() {
	        return "redirect:/form.html";  // static folder में form.html होना चाहिए
	    }
	}



