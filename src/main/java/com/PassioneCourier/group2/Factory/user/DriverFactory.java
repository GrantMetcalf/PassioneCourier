package com.PassioneCourier.group2.Factory.user;
import com.PassioneCourier.group2.Entity.user.Driver;

import java.time.LocalDate;
import java.util.Random;

public class DriverFactory {
    public static Driver createDriver(String name,String license,String email,String mobile,
                                      String address,String userName,String password,double income,
                                      LocalDate dob)
    {
        Random rand = new Random();
        int myDriverID = rand.nextInt(999999999);
        Driver myDriver = new Driver.DriverBuilder().setDriver_ID(myDriverID).setName(name).setLicense(license)
                .setEmail(email).setMobile(mobile).setAddress(address).setUserName(userName).setPassword(password)
                .setIncome(income).setDOB(dob).build();
        return myDriver;
    }
}
