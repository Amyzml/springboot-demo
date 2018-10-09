package com.zml.entity;

public class User {
    private Integer id;
    private String name;
    private String address;
    private String password;


    public User() {
    }

    public User(Integer id, String name, String address,String password) {
        this.id = id;
        this.name = name;
        this.address = address;
    }
    public User(Integer id, String name, String address) {
        this.id = id;
        this.name = name;
        this.address = address;
    }
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
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
