package com.PassioneCourier.group2.Entity.user;

import java.time.*;

/**
 *
 * Author:Justin Jenecke
 * Description: Entity for Helper
 * Date: 07/15/2020
 *
 * */

public class Helper {

    private int helperID;
    private String name, mobile, email, address, userName, password;
    private boolean income;
    private LocalDate DOB;

    private Helper(Builder builder) {

        this.helperID = builder.helperID;
        this.name = builder.name;
        this.mobile = builder.mobile;
        this.email = builder.email;
        this.address = builder.address;
        this.userName = builder.userName;
        this.password = builder.password;
        this.income = builder.income;
        this.DOB = builder.DOB;

    }

    public int getHelperID() {
        return helperID;
    }

    public String getName() {
        return name;
    }

    public String getMobile() {
        return mobile;
    }

    public String getEmail() {
        return email;
    }

    public String getAddress() {
        return address;
    }

    public String getUserName() {
        return userName;
    }

    public String getPassword() {
        return password;
    }

    public boolean isIncome() {
        return income;
    }

    public LocalDate getDOB() {
        return DOB;
    }

    public void loadVehicle(){
    }

    public void fillLog(){
    }

    @Override
    public String toString() {
        return "Helper{" +
                "helperID=" + helperID +
                ", name='" + name + '\'' +
                ", mobile='" + mobile + '\'' +
                ", email='" + email + '\'' +
                ", address='" + address + '\'' +
                ", userName='" + userName + '\'' +
                ", password='" + password + '\'' +
                ", income=" + income +
                ", DOB=" + DOB +
                '}';
    }

    public static class Builder{

        private int helperID;
        private String name, mobile, email, address, userName, password;
        private boolean income;
        private LocalDate DOB;

        public Builder setHelperID(int helperID){

            this.helperID = helperID;
            return this;

        }

        public Builder setName(String name){

            this.name = name;
            return this;
        }

        public Builder setMobile(String mobile){

            this.mobile = mobile;
            return this;
        }

        public Builder setEmail(String email){

            this.email = email;
            return this;
        }

        public Builder setAddress(String address){

            this.address = address;
            return this;
        }

        public Builder setUsername(String userName){

            this.userName = userName;
            return this;
        }

        public Builder setPassword(String password){

            this.password = password;
            return this;
        }

        public Builder setIncome(Boolean income){

            this.income = income;
            return this;
        }

        public Builder setDate(LocalDate DOB){

            this.DOB = DOB;
            return this;
        }

        public Builder copy(Helper helper){

            this.helperID = helper.helperID;
            this.name = helper.name;
            this.mobile = helper.mobile;
            this.email = helper.email;
            this.address = helper.address;
            this.userName = helper.userName;
            this.password = helper.password;
            this.income = helper.income;
            this.DOB = helper.DOB;

            return this;
        }

        public Helper build(){

            return new Helper(this);
        }

    }

}
