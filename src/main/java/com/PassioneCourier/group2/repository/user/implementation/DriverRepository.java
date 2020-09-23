package com.PassioneCourier.group2.repository.user.implementation;

import com.PassioneCourier.group2.Entity.user.Driver;
import com.PassioneCourier.group2.repository.user.DriverRepositoryInterface;

import java.util.Set;

public class DriverRepository implements DriverRepositoryInterface {

    private static DriverRepository repo = null;
    private Set<Driver> driverDatabase;

    public static DriverRepository getRepo(){
        if(repo == null)
            repo = new DriverRepository();
        return repo;
    }

    @Override
    public Set<Driver> getAll() {
        return null;
    }

    @Override
    public Driver create(Driver driver) {
        this.driverDatabase.add(driver);
        return driver;
    }

    @Override
    public Driver read(Integer myID) {
    for(Driver driver:this.driverDatabase){
        if(driver.getDriver_ID() == myID)
            return driver;
    }
        return null;
    }

    @Override
    public Driver update(Driver driver) {
        Driver oldDriver = read(driver.getDriver_ID());
        if(oldDriver !=null){
            this.driverDatabase.remove(oldDriver);
            this.driverDatabase.add(driver);
            return driver;
        }
        return null;
    }

    @Override
    public boolean delete(Integer myID) {
        Driver driver = read(myID);
        if(driver !=null){
            this.driverDatabase.remove(driver);
        }
        return this.driverDatabase.remove(driver);
    }

}
