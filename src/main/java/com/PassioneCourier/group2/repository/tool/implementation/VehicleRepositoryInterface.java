package com.PassioneCourier.group2.repository.tool.implementation;

import com.PassioneCourier.group2.Entity.tool.Vehicle;
import com.PassioneCourier.group2.repository.IRepository;

import java.util.Set;

public interface VehicleRepositoryInterface extends IRepository<Vehicle, Integer> {
    Set<Vehicle> getAll();
}