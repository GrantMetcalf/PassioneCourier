package com.PassioneCourier.group2.controller.service.user.service;

import com.PassioneCourier.group2.Entity.user.Driver;
import com.PassioneCourier.group2.Factory.user.DriverFactory;
import com.PassioneCourier.group2.service.user.service.DriverService;
import org.junit.Assert;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;
import com.PassioneCourier.group2.service.user.DriverServiceInterface;

import java.time.LocalDate;

import static org.junit.Assert.*;
@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class DriverServiceTest {
    private static DriverServiceInterface service = DriverService.getService();
    private static Driver driver = DriverFactory.createDriver("yaseen","CA912345","yaseen@gmail.com",
            "+2781234567","14 long street, Cape Town", "ylevy","password",
            200.00, LocalDate.parse("1999/21/07"));



    @Test
    public void a_create() {
        Driver created = service.create(driver);
        Assert.assertEquals(driver.getDriver_ID(),created.getDriver_ID());
        System.out.println("Created:" + created);
    }

    @Test
    public void b_read() {
        Driver read = service.read(driver.getDriver_ID());
        System.out.println("Read: " + read);
    }

    @Test
    public void c_update() {
        Driver updated = new Driver.DriverBuilder().copy(driver).build();
        updated = service.update(updated);
        System.out.println("Updated: "+updated);
    }
    @Test
    public void d_getAll() {
        System.out.println("Get all: "+service.getAll());
    }

    @Test
    public void e_delete() {
        service.delete(driver.getDriver_ID());
        assertEquals(0,driver.getDriver_ID());
    }
}