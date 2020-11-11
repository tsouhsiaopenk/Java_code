package com.zxp.pojo;

import lombok.Setter;
import lombok.ToString;

import java.util.Arrays;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

@Setter
public class Student {
    private String name;
    private Address address;
    private String[] books;
    private Map<String,String> card;
    private Set<String> games;
    private String wife;
    private Properties info;

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", address=" + address.toString() +
                ", books=" + Arrays.toString(books) +
                ", card=" + card +
                ", games=" + games +
                ", wife='" + wife + '\'' +
                ", info=" + info +
                '}';
    }

}
