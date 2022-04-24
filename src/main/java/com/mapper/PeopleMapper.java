package com.mapper;

import com.myclass.People;

public interface PeopleMapper {
    int deleteByPrimaryKey(long id);

    int insert(People record);

    int insertSelective(People record);

    People selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(People record);

    int updateByPrimaryKey(People record);
}