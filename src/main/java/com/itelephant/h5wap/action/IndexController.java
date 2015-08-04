package com.itelephant.h5wap.action;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class IndexController {
	
	@RequestMapping("/")
	public String index(Model model){
		return "/index";
	}
	
	@RequestMapping("/head")
	public String head(Model model){
		return "/public/head";
	}
	
	@RequestMapping("/footer")
	public String footer(Model model){
		return "/public/footer";
	}

}
