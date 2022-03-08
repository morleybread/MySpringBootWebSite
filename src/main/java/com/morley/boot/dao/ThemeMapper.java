package com.morley.boot.dao;

import com.morley.boot.bean.Theme;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

@Mapper
public interface ThemeMapper {
    @Select("select * from Androidtheme")
    public Theme[] theme();
}
