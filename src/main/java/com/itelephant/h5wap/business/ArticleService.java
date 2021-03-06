package com.itelephant.h5wap.business;

import java.util.List;

import com.itelephant.h5wap.entity.Article;

public interface ArticleService {
	public Article whichOne(Long id);
	public List<Article> listByKey(List<Long> ids);
}
