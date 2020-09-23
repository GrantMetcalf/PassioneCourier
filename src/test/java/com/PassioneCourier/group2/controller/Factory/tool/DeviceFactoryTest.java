package com.PassioneCourier.group2.controller.Factory.tool;

import com.PassioneCourier.group2.Entity.tool.Device;
import com.PassioneCourier.group2.Factory.tool.DeviceFactory;
import org.junit.Assert;
import org.junit.Test;

public class DeviceFactoryTest {

    @Test
    public void createDevice() {
        Device myDevice = DeviceFactory.createDevice("Android");
        String expected = myDevice.getType();
        String actual = myDevice.getType();

        Assert.assertEquals("Creates a Device Object", expected,actual);
        System.out.println("Device Details: " + myDevice);

    }
}