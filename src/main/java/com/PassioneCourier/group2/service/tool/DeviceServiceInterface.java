package com.PassioneCourier.group2.service.tool;

import com.PassioneCourier.group2.Entity.tool.Device;
import com.PassioneCourier.group2.service.IService;

import java.util.Set;

public interface DeviceServiceInterface extends IService<Device, Integer> {
    Set<Device> getAll();
}
