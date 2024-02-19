package com.project.fat.Dto;

import com.project.fat.Entity.User;

public class UserDto {

    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Long getPhoneNo() {
        return phoneNo;
    }

    public void setPhoneNo(Long phoneNo) {
        this.phoneNo = phoneNo;
    }

    private String email;
    private Long phoneNo;
    public UserDto(User user) {
        this.email = user.getEmail();
        this.name = user.getName();
        this.phoneNo = user.getPhoneNo();
    }

    public UserDto() {
    }
}
