package com.morley.boot.mapper;

import com.morley.boot.bean.Person;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

@Mapper
public interface PersonMapper {
    @Select("select * from person")
    public Person[] peploe();
}
