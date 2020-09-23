package com.PassioneCourier.group2.repository.tool.implementation;

import com.PassioneCourier.group2.Entity.tool.Vehicle;
import java.util.HashSet;
import java.util.Set;

public class VehicleRepository implements VehicleRepositoryInterface {

    private Set<Vehicle> vehicleDB;

    private static VehicleRepositoryInterface vehicleRepositoryInter = null;
    private VehicleRepository() {this.vehicleDB = new HashSet<>();
    }

    public static VehicleRepository getVehicleRepositoryInter(){
        if(vehicleRepositoryInter == null){
            vehicleRepositoryInter = new VehicleRepository();
        }
        return new VehicleRepository();
    }

    @Override
    public Set<Vehicle> getAll() {
        return this.vehicleDB;
    }

    @Override
    public Vehicle create(Vehicle t) {
        this.vehicleDB.add(t);
        return t;
    }

    @Override
    public Vehicle read(Integer myID) {
    Vehicle vehicleRepository = null;
        for (Vehicle veh : this.vehicleDB){
            vehicleRepository = veh;
        break;
    }
        return vehicleRepository;
}

    @Override
    public Vehicle update(Vehicle t) {
        Vehicle update = read(t.getVehicle_id());
        if(update != null){
            this.vehicleDB.remove(update);
            this.vehicleDB.add(t);
        }
        return t;
    }

    @Override
    public boolean delete(Integer myID) {
        Vehicle delete = read(myID);
        if(delete != null){
            this.vehicleDB.remove(myID);
        }
        return this.vehicleDB.remove(myID);

    }
}