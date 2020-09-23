package com.PassioneCourier.group2.controller.repository.tool.implementation;

import com.PassioneCourier.group2.Entity.tool.Device;
import com.PassioneCourier.group2.Factory.tool.DeviceFactory;
import com.PassioneCourier.group2.repository.tool.implementation.DeviceRepository;
import org.junit.Assert;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;
import com.PassioneCourier.group2.repository.tool.DeviceRepositoryInterface;


@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class DeviceRepositoryTest {
    public static DeviceRepositoryInterface myRepository = DeviceRepository.getMyDeviceRepository();
    private static Device myDevice = DeviceFactory.createDevice("Android");

    @Test
    public void a_create() {
        Device device00 = myRepository.create(myDevice);
        Assert.assertEquals(myDevice.getDevice_ID(), device00.getDevice_ID());
        System.out.println("Device Created: " + device00);
    }

    @Test
    public void b_read() {
        Device device01 = myRepository.read(myDevice.getDevice_ID());
        System.out.println("Read: " + device01);
    }

    @Test
    public void c_update() {
        Device device02 = new Device.DeviceBuilder().copy(myDevice).setDeviceType("Windows Phone").build();
        device02 = myRepository.update(device02);
        System.out.println("Updated: " + device02);
    }

    @Test
    public void e_delete() {
        myRepository.delete(myDevice.getDevice_ID());
    }

    @Test
    public void d_getAll() {
        System.out.println("Get all results: " + myRepository.getAll());
    }
}