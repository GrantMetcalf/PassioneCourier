package com.PassioneCourier.group2.controller.repository.user.implementation;

import com.PassioneCourier.group2.Entity.user.Driver;
import com.PassioneCourier.group2.Factory.user.DriverFactory;
import com.PassioneCourier.group2.repository.user.implementation.DriverRepository;
import org.junit.Assert;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;
import com.PassioneCourier.group2.repository.user.DriverRepositoryInterface;

import java.time.LocalDate;

import static org.junit.Assert.*;
@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class DriverRepositoryTest {

    private static DriverRepositoryInterface repository = DriverRepository.getRepo();
    private static Driver driver = DriverFactory.createDriver("yaseen","CA912345","yaseen@gmail.com",
            "+2781234567","14 long street, Cape Town", "ylevy","password",
            200.00, LocalDate.parse("1999/21/07"));

    @Test
    public void d_getAll() {
        System.out.println("Get all: "+repository.getAll());
    }

    @Test
    public void a_create() {
        Driver created = repository.create(driver);
        Assert.assertEquals(driver.getDriver_ID(),created.getDriver_ID());
        System.out.println("Created:" + created);
    }

    @Test
    public void b_read() {
        Driver read = repository.read(driver.getDriver_ID());
        System.out.println("Read: " + read);
    }

    @Test
    public void c_update() {
        Driver updated = new Driver.DriverBuilder().copy(driver).build();
        updated = repository.update(updated);
        System.out.println("Updated: "+updated);
    }


    @Test
    public void e_delete() {
         repository.delete(driver.getDriver_ID());
         assertEquals(0,driver.getDriver_ID());
    }
}