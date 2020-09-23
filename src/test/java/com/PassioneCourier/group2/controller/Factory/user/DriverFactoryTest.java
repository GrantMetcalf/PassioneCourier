package com.PassioneCourier.group2.controller.Factory.user;

import com.PassioneCourier.group2.Entity.user.Driver;
import com.PassioneCourier.group2.Factory.user.DriverFactory;
import org.junit.Assert;
import org.junit.Test;

import java.time.LocalDate;

public class DriverFactoryTest {

    @Test
    public void createDriver() {
        Driver expectedDriver = DriverFactory.createDriver("yaseen","CA912345","yaseen@gmail.com",
                "+2781234567","14 long street, Cape Town", "ylevy","password",
                200.00, LocalDate.parse("1999/21/07"));
        String name = expectedDriver.getName();
        String license = expectedDriver.getLicense();
        String email = expectedDriver.getEmail();
        String mobile = expectedDriver.getMobile();
        String address = expectedDriver.getAddress();
        String userName = expectedDriver.getUserName();
        String password = expectedDriver.getPassword();
        double income = expectedDriver.getIncome();
        LocalDate date = expectedDriver.getDOB();
        Driver actualDriver = DriverFactory.createDriver(name,license,email,mobile,address,userName,password,income,date);

        Assert.assertEquals("Creates a Employer Object", expectedDriver,actualDriver);
    }
}