package com.PassioneCourier.group2.service.user;

import com.PassioneCourier.group2.Entity.user.Driver;
import com.PassioneCourier.group2.service.IService;

import java.util.Set;

public interface DriverServiceInterface extends IService<Driver, Integer> {
    Set<Driver> getAll();
}
