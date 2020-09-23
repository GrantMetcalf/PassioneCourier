package com.PassioneCourier.group2.repository.unlabeled.implementation;

import com.PassioneCourier.group2.Entity.unlabeled.Route;
import com.PassioneCourier.group2.repository.unlabeled.RouteRepositoryInterface;

import java.util.HashSet;
import java.util.Set;

public class RouteRepository implements RouteRepositoryInterface {

    private static RouteRepositoryInterface route = null;
    private Set<Route> routeDB;

    private RouteRepository() {this.routeDB = new HashSet<>();}

    public static RouteRepositoryInterface getRepository(){
        if(route == null) route = new RouteRepository();
        return route;
    }

    @Override
    public Route create(Route t) {
        this.routeDB.add(t);
        return t;
    }

    @Override
    public Route read(Integer myID) {
        Route route = null;
        for(Route r: this.routeDB){
            route = r;
            break;
        }
        return route;
    }

    @Override
    public Route update(Route t) {
        Route oldRoute = read(t.getRoute_id());
        if(oldRoute != null){
            this.routeDB.remove(oldRoute);
            this.routeDB.add(t);
        }
        return t;
    }

    @Override
    public boolean delete(Integer myID) {
        Route myRoute = read(myID);
        if(myRoute != null){
            this.routeDB.remove(myID);
        }
        return this.routeDB.remove(myID);
    }

    @Override
    public Set<Route> getAll() {
        return this.routeDB;
    }

}
