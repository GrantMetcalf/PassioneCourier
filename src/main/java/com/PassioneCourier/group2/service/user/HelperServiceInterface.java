package com.PassioneCourier.group2.service.user;

import com.PassioneCourier.group2.Entity.user.Helper;
import com.PassioneCourier.group2.service.IService;

import java.util.Set;

public interface HelperServiceInterface extends IService<Helper, Integer> {

    Set<Helper> getAll();
}
