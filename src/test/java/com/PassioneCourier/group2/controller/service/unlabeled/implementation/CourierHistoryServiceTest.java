package com.PassioneCourier.group2.controller.service.unlabeled.implementation;

import com.PassioneCourier.group2.Entity.unlabeled.CourierHistory;
import com.PassioneCourier.group2.Factory.unlabeled.CourierHistoryFactory;
import com.PassioneCourier.group2.service.unlabeled.implementation.CourierHistoryService;
import org.junit.Assert;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;
import com.PassioneCourier.group2.service.unlabeled.CourierHistoryServiceInterface;

import java.time.LocalDate;
import java.time.Month;
import java.util.Set;

import static org.junit.Assert.*;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class CourierHistoryServiceTest {

    private static CourierHistoryServiceInterface serviceInterface = CourierHistoryService.getServiceInterface();
    LocalDate Day1 = LocalDate.of(2020, Month.AUGUST, 28);
    LocalDate Day2 = LocalDate.of(2020, Month.AUGUST, 30);
    private CourierHistory courierHistory = CourierHistoryFactory.createCourierHistory('a', 7708, 7700, 7, 6, 3, 123456789, Day1, Day2, 1200);

    @Test
    public void d_getAll() {
        Set<CourierHistory> courierHistories = serviceInterface.getAll();
        assertEquals(1, courierHistories.size());
        System.out.println("All products: " + courierHistories);
    }

    @Test
    public void a_create() {
        CourierHistory created = serviceInterface.create(courierHistory);
        Assert.assertEquals(courierHistory.getName(), created.getName());
        System.out.println("Created: " + created);
    }

    @Test
    public void b_read() {
        CourierHistory read = serviceInterface.read((int) courierHistory.getName());
        System.out.println("Read: " + read);
    }

    @Test
    public void c_update() {
        CourierHistory updated = new CourierHistory.Builder().copy(courierHistory).setDays(2).build();
        updated = serviceInterface.update(updated);
        System.out.println("Updated: " + updated);
    }

    @Test
    public void e_delete() {
        serviceInterface.delete((int) courierHistory.getName());
    }
}