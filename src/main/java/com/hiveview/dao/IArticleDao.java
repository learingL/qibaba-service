package com.hiveview.dao;

import com.hiveview.entity.Article;

public interface IArticleDao extends IBaseDao<Article>{
    int deleteByPrimaryKey(Long id);

    int insert(Article record);

    int insertSelective(Article record);

    Article selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(Article record);

    int updateByPrimaryKeyWithBLOBs(Article record);

    int updateByPrimaryKey(Article record);

    void addPageView(long articleId);
}