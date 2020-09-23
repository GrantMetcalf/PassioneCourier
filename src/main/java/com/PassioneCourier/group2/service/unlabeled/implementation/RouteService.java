package com.PassioneCourier.group2.service.unlabeled.implementation;

import com.PassioneCourier.group2.Entity.unlabeled.Route;
import com.PassioneCourier.group2.repository.unlabeled.RouteRepositoryInterface;
import com.PassioneCourier.group2.repository.unlabeled.implementation.RouteRepository;
import com.PassioneCourier.group2.service.unlabeled.RouteServiceInterface;

import java.util.Set;

public class RouteService implements RouteServiceInterface {

    private static RouteServiceInterface service = null;
    private RouteRepositoryInterface repositoryInterface;

    private RouteService(){
        this.repositoryInterface = RouteRepository.getRepository();
    }

    public static RouteServiceInterface getServiceInterface(){
        if (service == null) service = new RouteService();
        return service;
    }

    @Override
    public Route create(Route t) {
        return this.repositoryInterface.create(t);
    }

    @Override
    public Route read(Integer myID) {
        return this.repositoryInterface.read(myID);
    }

    @Override
    public Route update(Route t) {
        return this.repositoryInterface.update(t);
    }

    @Override
    public boolean delete(Integer myID) {
        return this.repositoryInterface.delete(myID);
    }

    @Override
    public Set<Route> getAll() {
        return this.repositoryInterface.getAll();
    }
}
