package com.oneday.pojo;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Person {
    private Integer id;

    private String name;

    private Integer gender;

    private String address;

    private Date birthday;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public Integer getGender() {
        return gender;
    }

    public void setGender(Integer gender) {
        this.gender = gender;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address == null ? null : address.trim();
    }

    public String getBirthday() {
    	SimpleDateFormat simpleDateFormat=new SimpleDateFormat("yyyy-MM-dd");
        return simpleDateFormat.format(birthday);
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }
}