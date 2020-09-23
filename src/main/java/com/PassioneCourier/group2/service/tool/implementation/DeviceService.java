package com.PassioneCourier.group2.service.tool.implementation;

import com.PassioneCourier.group2.Entity.tool.Device;
import com.PassioneCourier.group2.repository.tool.DeviceRepositoryInterface;
import com.PassioneCourier.group2.repository.tool.implementation.DeviceRepository;
import com.PassioneCourier.group2.service.tool.DeviceServiceInterface;
import org.springframework.stereotype.Service;

import java.util.Set;


@Service
public class DeviceService implements DeviceServiceInterface {

    public static DeviceServiceInterface myService = null;
    private DeviceRepositoryInterface myRepository;

    private DeviceService(){
        this.myRepository = DeviceRepository.getMyDeviceRepository();
    }

    public static DeviceServiceInterface getDeviceService(){
        if(myService == null){
            myService = new DeviceService();
        }
        return myService;
    }

    @Override
    public Set<Device> getAll() {
        return this.myRepository.getAll();
    }

    @Override
    public Device create(Device t) {
        return this.myRepository.create(t);
    }

    @Override
    public Device read(Integer myID) {
        return this.myRepository.read(myID);
    }

    @Override
    public Device update(Device t) {
        return this.myRepository.update(t);
    }

    @Override
    public boolean delete(Integer myID) { return this.myRepository.delete(myID);


    }
}
