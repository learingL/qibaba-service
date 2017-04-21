package com.hiveview.dao;

import com.hiveview.entity.Need;
import com.hiveview.entity.UserNeed;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;

public interface INeedDao extends IBaseDao<Need>{
    int deleteByPrimaryKey(Long id);

    int insert(Need record);

    int insertSelective(Need record);

    Need selectByPrimaryKey(Long needId);

    int updateByPrimaryKeySelective(Need record);

    int updateByPrimaryKey(Need record);

    List<Need> getNeed(Need need);

    List<Need> getOpenNeed(Need need);

    Need getNeedDetail(Need need);

    int addHitsByNid(long id);

    /*
        用户需要部分
     */
    List<UserNeed> getUserNeed(UserNeed userNeed);

    /**
     * 用户留言
     * @return
     */
    List<Map<String,Object>> getLiuYanList(Map<String,Object> map);

    int updateUserNeedByPrimaryKey(UserNeed userNeed);
    int insertUserNeed(UserNeed userNeed);
}