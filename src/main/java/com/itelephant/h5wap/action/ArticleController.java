package com.itelephant.h5wap.action;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import com.itelephant.h5wap.business.ArticleService;
import com.itelephant.h5wap.entity.Article;

@Controller
public class ArticleController {
		@Autowired
		private ArticleService articleService;
		
		@RequestMapping("/article/{id}")
		public String village(@PathVariable Long id, Model model) {
			Article article = articleService.whichOne(id);
			model.addAttribute("title", article.getPostTitle());
			model.addAttribute("content", article.getPostContent());
			model.addAttribute("source", article.getPostSource());
			model.addAttribute("hits", article.getPostHits());
			model.addAttribute("like", article.getPostLike());
			return "/article/detail";
		}
}
