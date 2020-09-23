package com.PassioneCourier.group2.repository.unlabeled;

import com.PassioneCourier.group2.Entity.unlabeled.Route;
import com.PassioneCourier.group2.repository.IRepository;

import java.util.Set;

public interface RouteRepositoryInterface extends IRepository<Route, Integer> {
    Set<Route> getAll();
}