package com.PassioneCourier.group2.controller.Factory.tool;

import com.PassioneCourier.group2.Entity.tool.Vehicle;
import com.PassioneCourier.group2.Factory.tool.VehicleFactory;
import org.junit.Assert;
import org.junit.Test;

public class VehicleFactoryTest {

    @Test
    public void createVehicle() {
        Vehicle vehicle = VehicleFactory.createVehicle("DAF FX 106",2729456.00,"16/08/2020",
                "Paint cracks","Excellent", "CA912345");

        Assert.assertEquals(vehicle, vehicle);
        //System.out.println("Details of " + vehicle);

    }
}
