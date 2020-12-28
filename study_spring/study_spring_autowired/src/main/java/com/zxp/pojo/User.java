package com.zxp.pojo;

import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

@Data
public class User {

    @Autowired
    @Qualifier(value = "cat11")
    private Cat cat;

    @Autowired
    @Qualifier(value = "dog222")
    private Dog dog;

    private String name;
}
