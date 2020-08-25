package repository.user.implementation;

import Entity.user.Employer;
import repository.tool.DeviceRepositoryInterface;
import repository.tool.implementation.DeviceRepository;
import repository.user.EmployerRepositoryInterface;
import java.util.HashSet;
import java.util.Set;

public class EmployerRepository implements EmployerRepositoryInterface {

    private Set<Employer> empDataBase;

    private static EmployerRepositoryInterface myEmployerRepository = null;
    private EmployerRepository() {
        this.empDataBase = new HashSet<>();
    }

    public static EmployerRepositoryInterface getMyEmployerRepository(){
        if(myEmployerRepository == null){
            myEmployerRepository = new EmployerRepository();
        }
        return new EmployerRepository();
    }



    @Override
    public Employer create(Employer t) {
        this.empDataBase.add(t);
        return t;
    }

    @Override
    public Employer read(Integer myID) {
        Employer myEmployer = null;
        for(Employer emp: this.empDataBase){
            myEmployer = emp;
            break;
        }
        return myEmployer;
    }

    @Override
    public Employer update(Employer t) {
        Employer myEmployerOld = read(t.getEmployerId());
        if(myEmployerOld != null){
            this.empDataBase.remove(myEmployerOld);
            this.empDataBase.add(t);
        }
        return t;
    }

    @Override
    public void delete(Integer myID) {
        Employer myEmployer = read(myID);
        if(myEmployer != null){
            this.empDataBase.remove(myID);
        }

    }
}



