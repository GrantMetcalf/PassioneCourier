package com.PassioneCourier.group2.controller.service.user;

import com.PassioneCourier.group2.Entity.user.Employer;
import com.PassioneCourier.group2.Factory.user.EmployerFactory;
import com.PassioneCourier.group2.service.user.EmployerServiceInterface;
import org.junit.Assert;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;
import com.PassioneCourier.group2.service.user.service.EmployerService;

import java.util.Set;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class EmployerServiceTest {

    private static EmployerServiceInterface myService = EmployerService.getEmployerService();
    private static Employer myEmployer = EmployerFactory.createEmployer("Constantine", "John");

    @Test
    public void a_create() {
        Employer myEmployer00 = myService.create(myEmployer);
        Assert.assertEquals(myEmployer.getEmployerId(), myEmployer00.getEmployerId());
        System.out.println("Employer Created: " + myEmployer00);
    }

    @Test
    public void b_read() {
        Employer myEmployer01 = myService.read(myEmployer.getEmployerId());
        System.out.println("Read: " +myEmployer01);
    }

    @Test
    public void c_update() {
        Employer myEmployer02 = new Employer.EmployerBuilder().copy(myEmployer).setLastName("Lark").setFirstName("John").build();
        myEmployer02 = myService.update(myEmployer02);
        System.out.println("Updated: " + myEmployer02);
    }

    @Test
    public void d_getAll() {
        Set<Employer> myEmployers = myService.getAll();
        Assert.assertEquals(1, myEmployers.size());
        System.out.println("Get all Results: " + myEmployers);
    }


    @Test
    public void e_delete() {
        boolean deleted = myService.delete(myEmployer.getEmployerId());

    }
}