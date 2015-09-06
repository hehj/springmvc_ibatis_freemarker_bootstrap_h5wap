package com.itelephant.h5wap.dao;

import com.itelephant.h5wap.entity.Article;

public interface ArticleMapper {
	Article whichOneByPrimaryKey(Long id);
	int updateByPrimaryKey(Article article);
}
