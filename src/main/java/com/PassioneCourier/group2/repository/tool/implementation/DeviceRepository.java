package com.PassioneCourier.group2.repository.tool.implementation;

import com.PassioneCourier.group2.Entity.tool.Device;
import com.PassioneCourier.group2.repository.tool.DeviceRepositoryInterface;
import java.util.HashSet;
import java.util.Set;

public class DeviceRepository implements DeviceRepositoryInterface {

    private Set<Device> devDatabase;

    private static DeviceRepositoryInterface myDeviceRepository = null;
    private DeviceRepository() {
        this.devDatabase = new HashSet<>();
    }

    public static DeviceRepositoryInterface getMyDeviceRepository(){
        if(myDeviceRepository == null){
            myDeviceRepository = new DeviceRepository();
        }
        return new DeviceRepository();
    }


    @Override
    public Device create(Device t) {
        this.devDatabase.add(t);
        return t;

    }

    @Override
    public Device read(Integer myID) {
        Device myDevice = null;
        for(Device dev: this.devDatabase){
            myDevice = dev;
            break;
        }
        return myDevice;
    }

    @Override
    public Device update(Device t) {
        Device myDeviceOld = read(t.getDevice_ID());
        if(myDeviceOld != null){
            this.devDatabase.remove(myDeviceOld);
            this.devDatabase.add(t);
        }
        return t;
    }

    @Override
    public boolean delete(Integer myID) {
        Device myDevice = read(myID);
        if(myDevice != null){
             this.devDatabase.remove(myID);
        }
        return this.devDatabase.remove(myID);
    }

    @Override
    public Set<Device> getAll() {
        return this.devDatabase;
    }
}
