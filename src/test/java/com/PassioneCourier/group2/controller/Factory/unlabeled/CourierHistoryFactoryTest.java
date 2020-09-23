package com.PassioneCourier.group2.controller.Factory.unlabeled;

import com.PassioneCourier.group2.Entity.unlabeled.CourierHistory;
import com.PassioneCourier.group2.Factory.unlabeled.CourierHistoryFactory;
import org.junit.Test;

import java.time.LocalDate;
import java.time.Month;

public class CourierHistoryFactoryTest {

    @Test
    public void createCourierHistory() {
        LocalDate Day1 = LocalDate.of(2020, Month.AUGUST, 28);
        LocalDate Day2 = LocalDate.of(2020, Month.AUGUST, 30);
        CourierHistory courierHistory = CourierHistoryFactory.createCourierHistory('a', 7708, 7700, 7, 6, 2, 123456789, Day1, Day2, 1200);
        System.out.println(courierHistory);
    }
}
