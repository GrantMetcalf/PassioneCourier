package com.PassioneCourier.group2.Entity.user;

import java.time.LocalDate;

public class Driver {

    //instance
    private int driver_ID;
    private String name,license,mobile,email,address,userName,password;
    private double income;
    private LocalDate DOB;

    //constructor
    private Driver(DriverBuilder builder){
        this.driver_ID = builder.driver_ID;
        this.name = builder.name;
        this.license = builder.license;
        this.mobile = builder.mobile;
        this.email = builder.email;
        this.address = builder.address;
        this.userName = builder.userName;
        this.password = builder.password;

    }

    private void fillLog(){
        //need more clarification on what this method does
    }

    //getters
    public int getDriver_ID() {
        return driver_ID;
    }

    public String getName() {
        return name;
    }

    public String getLicense() {
        return license;
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
    public LocalDate getDOB () {
        return DOB;
    }
    public double getIncome () {
        return income;
    }

    @Override
    public String toString() {
        return "Driver{" +
                "driver_ID=" + driver_ID +
                ", name='" + name + '\'' +
                ", license='" + license + '\'' +
                ", mobile='" + mobile + '\'' +
                ", email='" + email + '\'' +
                ", address='" + address + '\'' +
                ", userName='" + userName + '\'' +
                ", password='" + password + '\'' +
                ", income=" + income +
                ", DOB=" + DOB +
                '}';
    }

    public static class DriverBuilder

    {
        private int driver_ID;
        private String name,license,mobile,email,address,userName,password;
        private double income;
        private LocalDate DOB;

        public DriverBuilder setName(String name){
            this.name = name;
        return this;}

        public DriverBuilder setDriver_ID(int driver_ID) {
            this.driver_ID = driver_ID;
        return this;}

        public DriverBuilder setLicense(String license) {
            this.license = license;
        return this;}

        public DriverBuilder setMobile(String mobile) {
            this.mobile = mobile;
        return this;}

        public DriverBuilder setAddress(String address){
            this.address = address;
            return this;}

        public DriverBuilder setEmail(String email) {
            this.email = email;
        return this;}

        public DriverBuilder setUserName(String userName) {
            this.userName = userName;
        return this;}

        public DriverBuilder setPassword(String password){
        this.password = password;
        return this;}

    public DriverBuilder setIncome(double income){
        this.income = income;
        return this;}

        public DriverBuilder setDOB(LocalDate DOB){
        this.DOB = DOB;
        return this;}


        public DriverBuilder(){
        }


    public DriverBuilder copy(Driver driver){
        this.driver_ID = driver.driver_ID;
        this.name = driver.name;
        this.license = driver.license;
        this.mobile = driver.mobile;
        this.email = driver.email;
        this.address = driver.address;
        this.userName = driver.userName;
        this.password = driver.password;


        return this;}
        public Driver build(){

        return new Driver(this);
        }
    }
}
