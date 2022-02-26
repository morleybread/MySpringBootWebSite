package com.morley.boot.sevice;

import com.morley.boot.bean.Person;
import com.morley.boot.mapper.PersonMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PersonService {
    @Autowired
    PersonMapper personMapper;
    public Person[] people(){
        return personMapper.peploe();
    }

}
