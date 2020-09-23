package com.PassioneCourier.group2.controller.tool;


import com.PassioneCourier.group2.Entity.tool.Device;
import com.PassioneCourier.group2.Entity.user.Employer;
import com.PassioneCourier.group2.Factory.tool.DeviceFactory;
import com.PassioneCourier.group2.service.tool.implementation.DeviceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Set;


@RestController
@RequestMapping("/device")
public class DeviceController {

    @Autowired
    private DeviceService deviceService;

    @PostMapping ("/create")
    public Device create(@RequestBody Device dev){
        Device newDevice = DeviceFactory.createDevice(dev.getType());
        return deviceService.create(newDevice);

    }

    @GetMapping("/all")
    public Set<Device> getAll(){
        return deviceService.getAll();
    }


}
