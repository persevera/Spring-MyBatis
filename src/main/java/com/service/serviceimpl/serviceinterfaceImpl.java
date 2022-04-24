package com.service.serviceimpl;

import com.mapper.PeopleMapper;
import com.myclass.People;
import com.service.serviceinterface;

public class serviceinterfaceImpl implements serviceinterface {
    private PeopleMapper peopleMapper;

    public void setPeopleMapper(PeopleMapper peopleMapper) {
        this.peopleMapper = peopleMapper;
    }

    public People selectbyid(Integer id) {
      return  peopleMapper.selectByPrimaryKey(id);
    }
}
