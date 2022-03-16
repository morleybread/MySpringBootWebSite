package com.morley.boot.sevice;

import com.morley.boot.bean.Theme;
import com.morley.boot.dao.ThemeMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ThemeSevice {
    @Autowired
    ThemeMapper themeMapper;

    public Theme[] themes(){

        return themeMapper.theme();

    }

}
