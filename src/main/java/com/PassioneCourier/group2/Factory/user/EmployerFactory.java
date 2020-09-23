package com.PassioneCourier.group2.Factory.user;


import com.PassioneCourier.group2.Entity.user.Employer;
import java.util.Random;

public class EmployerFactory {

    public static Employer createEmployer(String lnm, String fnm){
        Random rando = new Random();
        int myEmployerID = rando.nextInt(999999999);
        Employer myEmployer = new Employer.EmployerBuilder().setEmployerID(myEmployerID).setLastName(lnm)
                .setFirstName(fnm).build();
        return myEmployer;

    }
}
