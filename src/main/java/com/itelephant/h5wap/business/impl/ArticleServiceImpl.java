package com.itelephant.h5wap.business.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.itelephant.h5wap.business.ArticleService;
import com.itelephant.h5wap.dao.ArticleMapper;
import com.itelephant.h5wap.entity.Article;

@Service
public class ArticleServiceImpl implements ArticleService {

	@Autowired
	private ArticleMapper articleDao;
	
	public Article whichOne(Long id) {
		return articleDao.whichOneByPrimaryKey(id);
	}

}