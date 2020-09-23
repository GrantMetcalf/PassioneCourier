package com.PassioneCourier.group2.repository.user;

import com.PassioneCourier.group2.Entity.user.Employer;
import com.PassioneCourier.group2.repository.IRepository;

import java.util.Set;

public interface EmployerRepositoryInterface extends IRepository<Employer, Integer> {
    Set<Employer> getAll();
}
