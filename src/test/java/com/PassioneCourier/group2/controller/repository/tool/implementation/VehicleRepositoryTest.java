package com.PassioneCourier.group2.controller.repository.tool.implementation;

import com.PassioneCourier.group2.Entity.tool.Vehicle;
import com.PassioneCourier.group2.Factory.tool.VehicleFactory;
import com.PassioneCourier.group2.repository.tool.implementation.VehicleRepository;
import com.PassioneCourier.group2.repository.tool.implementation.VehicleRepositoryInterface;
import org.junit.Test;
import static org.junit.Assert.assertEquals;


public class VehicleRepositoryTest {
    private static VehicleRepositoryInterface vehicleRepositoryInterface = VehicleRepository.getVehicleRepositoryInter();
    private Vehicle vehicle = VehicleFactory.createVehicle("DAF FX 106", 2729456.00, "16/08/2020",
            "Paint cracks", "Excellent", "CA912345");

    @Test
    public void testGetAll() {
        {
            System.out.println(vehicleRepositoryInterface.getAll());
        }
    }
    @Test
    public void testcreate() {
        Vehicle create = vehicleRepositoryInterface.create(vehicle);
        assertEquals(vehicle.getPlate(), create.getPlate());
        System.out.println("Created: " + create);
    }

    @Test
    public void testread() {
        Vehicle read = vehicleRepositoryInterface.read(vehicle.getVehicle_id());
        System.out.println("Read: " + read);
    }

    @Test
    public void testupdate() {
        Vehicle update = new Vehicle.VehicleBuilder().copy(vehicle).setVehicle_ID(32).setType("BMW Semi")
                .setMileage(896575.00).setLastServiceDate("29/08/2020")
                .setStatus("Poor").setPlate("CA589642").createVehicle();
        update = vehicleRepositoryInterface.update(update);
        System.out.println("Updated: " + update);
    }
    @Test
    public void testdelete() {
        vehicleRepositoryInterface.delete(vehicle.getVehicle_id());
        System.out.println("Deleted: " + vehicleRepositoryInterface);

    }
}
