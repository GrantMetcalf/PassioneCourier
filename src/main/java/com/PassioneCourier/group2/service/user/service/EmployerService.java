package com.PassioneCourier.group2.service.user.service;

import com.PassioneCourier.group2.Entity.user.Employer;
import com.PassioneCourier.group2.repository.user.EmployerRepositoryInterface;
import com.PassioneCourier.group2.repository.user.implementation.EmployerRepository;
import com.PassioneCourier.group2.service.user.EmployerServiceInterface;
import org.springframework.stereotype.Service;
import java.util.Set;

@Service
public class EmployerService implements EmployerServiceInterface {

    public static EmployerServiceInterface myService = null;
    private EmployerRepositoryInterface myRepository;

    public EmployerService(){
        this.myRepository = EmployerRepository.getMyEmployerRepository();
    }

    public static EmployerServiceInterface getEmployerService(){
        if(myService == null){
            myService = new EmployerService();
        }
        return myService;
    }


    @Override
    public Set<Employer> getAll() {
        return this.myRepository.getAll();
    }

    @Override
    public Employer create(Employer t) {
        return this.myRepository.create(t);
    }

    @Override
    public Employer read(Integer myID) {
        return this.myRepository.read(myID);
    }

    @Override
    public Employer update(Employer t) {
        return this.myRepository.update(t);
    }

    @Override
    public boolean delete(Integer myID) {
        return this.myRepository.delete(myID);

    }
}
