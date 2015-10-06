package com.itelephant.h5wap.action;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.itelephant.h5wap.business.ArticleService;
import com.itelephant.h5wap.entity.Article;

@Controller
public class IndexController {
	
	@Autowired
	private ArticleService articleService;
	
	@RequestMapping("/")
	public String index(Model model){
		List<Long> key = new ArrayList<Long>();
		key.add(33L);key.add(35L);key.add(43L);
		List<Article> leftOneResult = articleService.listByKey(key);
		key = new ArrayList<Long>();
		key.add(26L);key.add(31L);key.add(32L);
		List<Article> rightOneResult = articleService.listByKey(key);
		key = new ArrayList<Long>();
		key.add(45L);key.add(46L);key.add(44L);
		List<Article> leftTwoResult = articleService.listByKey(key);
		key = new ArrayList<Long>();
		key.add(48L);key.add(49L);key.add(47L);
		List<Article> rightTwoResult = articleService.listByKey(key);

		model.addAttribute("leftOne", leftOneResult);
		model.addAttribute("rightOne", rightOneResult);
		model.addAttribute("leftTwo", leftTwoResult);
		model.addAttribute("rightTwo", rightTwoResult);
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
