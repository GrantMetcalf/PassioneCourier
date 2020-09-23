package com.PassioneCourier.group2.repository.tool;

import com.PassioneCourier.group2.Entity.tool.Device;
import com.PassioneCourier.group2.repository.IRepository;

import java.util.Set;

public interface DeviceRepositoryInterface extends IRepository<Device, Integer> {
    Set<Device> getAll();

}
