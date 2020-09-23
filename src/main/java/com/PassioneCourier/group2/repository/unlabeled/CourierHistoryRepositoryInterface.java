package com.PassioneCourier.group2.repository.unlabeled;

import com.PassioneCourier.group2.Entity.unlabeled.CourierHistory;
import com.PassioneCourier.group2.repository.IRepository;

import java.util.Set;

public interface CourierHistoryRepositoryInterface extends IRepository<CourierHistory, Character> {
    Set<CourierHistory> getAll();
}
