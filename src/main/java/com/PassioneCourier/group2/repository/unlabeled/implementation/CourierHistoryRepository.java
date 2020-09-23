package com.PassioneCourier.group2.repository.unlabeled.implementation;

import com.PassioneCourier.group2.Entity.unlabeled.CourierHistory;
import com.PassioneCourier.group2.repository.unlabeled.CourierHistoryRepositoryInterface;

import java.util.HashSet;
import java.util.Set;

public class CourierHistoryRepository implements CourierHistoryRepositoryInterface {

    private Set<CourierHistory> courierHistoryDB;

    public CourierHistoryRepository() {
        this.courierHistoryDB = new HashSet<>();
    }

    private static CourierHistoryRepositoryInterface myCourierHistoryRepository = null;

    public static CourierHistoryRepositoryInterface getMyCourierHistoryRepository() {
        if (myCourierHistoryRepository == null) {
            myCourierHistoryRepository = new CourierHistoryRepository();
        }
        return new CourierHistoryRepository();
    }

    @Override
    public Set<CourierHistory> getAll() {
        return this.courierHistoryDB;
    }

    @Override
    public CourierHistory create(CourierHistory t) {
        this.courierHistoryDB.add(t);
        return t;
    }

    @Override
    public CourierHistory read(Character myID) {
        CourierHistory courierHistory = null;
        for (CourierHistory c : this.courierHistoryDB) {
            courierHistory = c;
            break;
        }
        return courierHistory;
    }

    @Override
    public CourierHistory update(CourierHistory t) {
        CourierHistory oldCourierHistory = read(t.getName());
        if (oldCourierHistory != null) {
            this.courierHistoryDB.remove(oldCourierHistory);
            this.courierHistoryDB.add(t);
        }
        return t;
    }

    @Override
    public boolean delete(Character myID) {
        CourierHistory courierHistory = read(myID);
        if (courierHistory != null) this.courierHistoryDB.remove(courierHistory);
        return this.courierHistoryDB.remove(courierHistory);

    }
}
