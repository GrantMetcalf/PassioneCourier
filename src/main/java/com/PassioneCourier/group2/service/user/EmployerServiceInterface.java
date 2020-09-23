package com.PassioneCourier.group2.service.user;

import com.PassioneCourier.group2.Entity.user.Employer;
import com.PassioneCourier.group2.service.IService;

import java.util.Set;

public interface EmployerServiceInterface extends IService<Employer,String> {
    Set<Employer> getAll();
}
