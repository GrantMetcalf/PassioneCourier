package com.PassioneCourier.group2.repository.user;

import com.PassioneCourier.group2.Entity.user.Helper;
import com.PassioneCourier.group2.repository.IRepository;

import java.util.Set;

public interface HelperRepositoryInterface extends IRepository<Helper, Integer> {

    Set<Helper> getAll();

}
