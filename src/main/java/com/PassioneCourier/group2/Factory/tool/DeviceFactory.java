package com.PassioneCourier.group2.Factory.tool;

import com.PassioneCourier.group2.Entity.tool.Device;
import java.util.Random;

public class DeviceFactory {

    public static Device createDevice(String typ){
        Random rand = new Random();
        int myDeviceID = rand.nextInt(999999999);
        Device myDevice = new Device.DeviceBuilder().setDeviceID(myDeviceID).setDeviceType(typ).build();
        return myDevice;
    }
}
