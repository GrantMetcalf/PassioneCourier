package com.PassioneCourier.group2.service.unlabeled;

import com.PassioneCourier.group2.Entity.unlabeled.CourierHistory;
import com.PassioneCourier.group2.service.IService;

import java.util.Set;

public interface CourierHistoryServiceInterface extends IService<CourierHistory, Integer> {
    Set<CourierHistory> getAll();

    //unique business logic
}
