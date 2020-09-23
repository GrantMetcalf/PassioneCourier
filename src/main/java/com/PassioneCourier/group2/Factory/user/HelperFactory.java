package com.PassioneCourier.group2.Factory.user;

import com.PassioneCourier.group2.Entity.user.Helper;

import java.time.LocalDate;

public class HelperFactory {

    public static Helper createHelper(int helperID, String name, String mobile, String email, String address, String userName, String password, boolean income, LocalDate DOB){

        Helper helper = new Helper.Builder()
                .setHelperID(helperID)
                .setName(name)
                .setMobile(mobile)
                .setEmail(email)
                .setAddress(address)
                .setUsername(userName)
                .setPassword(password)
                .setIncome(income)
                .setDate(DOB)
                .build();

        return helper;
    }
}
