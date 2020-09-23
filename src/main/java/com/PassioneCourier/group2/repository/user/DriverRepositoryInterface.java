package com.PassioneCourier.group2.repository.user;

import com.PassioneCourier.group2.Entity.user.Driver;
import com.PassioneCourier.group2.repository.IRepository;

import java.util.Set;

public interface DriverRepositoryInterface extends IRepository<Driver, Integer> {
    Set<Driver> getAll();
}
