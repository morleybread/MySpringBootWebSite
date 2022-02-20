package com.morley.boot.bean;

import lombok.AllArgsConstructor;
import lombok.Data;

//@NoArgsConstructor
@Data
@AllArgsConstructor
public class Pet {
    private String name;


    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Pet{" +
                "name='" + name + '\'' +
                '}';
    }

    public void setName(String name) {
        this.name = name;
    }
}
