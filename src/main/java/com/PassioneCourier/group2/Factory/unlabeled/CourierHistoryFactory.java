package com.PassioneCourier.group2.Factory.unlabeled;

import com.PassioneCourier.group2.Entity.unlabeled.CourierHistory;

import java.time.LocalDate;

public class CourierHistoryFactory {

    public static CourierHistory createCourierHistory(char name, int from_location_ID, int to_location_ID, int driverID, int helperID, int days, int product_id, LocalDate dispatchTime, LocalDate deliverTime, float price){
            CourierHistory courierHistory = new CourierHistory.Builder().setName(name)
                            .setFrom_location_ID(from_location_ID)
                            .setTo_location_ID(to_location_ID)
                            .setDriverID(driverID)
                            .setHelperID(helperID)
                            .setDays(days)
                            .setProduct_id(product_id)
                            .setDispatchTime(dispatchTime)
                            .setDeliverTime(deliverTime)
                            .setPrice(price)
                            .build();
            return courierHistory;
    }
}
