package com.PassioneCourier.group2.service.unlabeled;

import com.PassioneCourier.group2.Entity.unlabeled.Route;
import com.PassioneCourier.group2.service.IService;

import java.util.Set;

public interface RouteServiceInterface extends IService <Route, Integer> {
    Set<Route> getAll();
}
