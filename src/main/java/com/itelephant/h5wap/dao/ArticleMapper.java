package com.itelephant.h5wap.dao;

import java.util.List;

import com.itelephant.h5wap.entity.Article;

public interface ArticleMapper {
	Article whichOneByPrimaryKey(Long id);
	List<Article> listByKey(List<Long> ids);
	int updateByPrimaryKey(Article article);
}
