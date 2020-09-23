package com.PassioneCourier.group2.repository.user.implementation;

import com.PassioneCourier.group2.Entity.user.Helper;
import com.PassioneCourier.group2.repository.user.HelperRepositoryInterface;

import java.util.HashSet;
import java.util.Set;

public class HelperRepository implements HelperRepositoryInterface {

    private Set<Helper> helpDatabase;
    private static HelperRepositoryInterface helperRepo = null;

    public HelperRepository(){

        this.helpDatabase = new HashSet<>();
    }

    public static HelperRepositoryInterface getHelperRepo(){

        if (helperRepo == null)
                helperRepo = new HelperRepository();
        return helperRepo;
    }

    @Override
    public Helper create(Helper cHelp) {
        this.helpDatabase.add(cHelp);
        return cHelp;
    }

    @Override
    public Helper read(Integer id) {

        Helper helper = null;
        for (Helper n : this.helpDatabase){
            helper = n;
            break;
        }
        return helper;
    }

    @Override
    public Helper update(Helper newHelp) {

        Helper oldHelper = read(newHelp.getHelperID());
        if (oldHelper != null){
            this.helpDatabase.remove(oldHelper);
            this.helpDatabase.add(newHelp);
        }
        return newHelp;
    }

    @Override
    public boolean delete(Integer id) {

        Helper delHelp = read(id);
        if (delHelp != null)
            this.helpDatabase.remove(delHelp);
        return this.helpDatabase.remove(delHelp);
    }

    @Override
    public Set<Helper> getAll() {
        return this.helpDatabase;
    }
}
