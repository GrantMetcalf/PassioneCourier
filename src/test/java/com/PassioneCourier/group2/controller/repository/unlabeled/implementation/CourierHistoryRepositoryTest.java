package com.PassioneCourier.group2.controller.repository.unlabeled.implementation;

import com.PassioneCourier.group2.Entity.unlabeled.CourierHistory;
import com.PassioneCourier.group2.Factory.unlabeled.CourierHistoryFactory;
import com.PassioneCourier.group2.repository.unlabeled.implementation.CourierHistoryRepository;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;
import com.PassioneCourier.group2.repository.unlabeled.CourierHistoryRepositoryInterface;

import java.time.LocalDate;
import java.time.Month;

import static org.junit.Assert.*;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class CourierHistoryRepositoryTest {

    private static CourierHistoryRepositoryInterface repositoryInterface = new CourierHistoryRepository();
    LocalDate Day1 = LocalDate.of(2020, Month.AUGUST, 28);
    LocalDate Day2 = LocalDate.of(2020, Month.AUGUST, 30);
    private CourierHistory courierHistory = CourierHistoryFactory.createCourierHistory('a', 7708, 7700, 7, 6, 3, 123456789, Day1, Day2, 1200);

    @Test
    public void d_getAll() {
        System.out.println(repositoryInterface.getAll());
    }

    @Test
    public void a_create() {
        CourierHistory created = repositoryInterface.create(courierHistory);
        assertEquals(courierHistory.getName(), created.getName());
        System.out.println("Create:" + created);
    }

    @Test
    public void b_read() {
        CourierHistory read = repositoryInterface.read(courierHistory.getName());
        System.out.println("Read: " + read);
    }

    @Test
    public void c_update() {
        CourierHistory updated = new CourierHistory.Builder().copy(courierHistory).setDays(2).build();
        updated = repositoryInterface.update(updated);
        System.out.println("Updated: " + updated);
    }

    @Test
    public void e_delete() {
        repositoryInterface.delete(courierHistory.getName());
    }
}
