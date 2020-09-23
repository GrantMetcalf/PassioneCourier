package com.PassioneCourier.group2.repository.unlabeled.implementation;

import com.PassioneCourier.group2.Entity.unlabeled.Destination;

import java.util.HashSet;
import java.util.Set;

public class DestinationRepository implements DestinationRepositoryInterface {
    private static DestinationRepository destination = null;
    private Set<Destination> destinationsDB;

    public DestinationRepository() {
        this.destinationsDB = new HashSet<>();
    }


    @Override
    public Set<Destination> getAll() {
        return this.destinationsDB;
    }

    @Override
    public Destination create(Destination t) {
        this.destinationsDB.add(t);
        return t;
    }

    @Override
    public Destination read(String myID) {
        Destination destinationRepository = null;
        for (Destination d : this.destinationsDB){
            destinationRepository = d;
            break;
        }
        return destinationRepository;
    }

    @Override
    public Destination update(Destination t) {
        Destination update = read(t.getName());
        if(update != null){
            this.destinationsDB.remove(update);
            this.destinationsDB.add(t);
        }
        return t;
    }

    @Override
    public boolean delete(String myID) {
        Destination delete = read(myID);
        if(delete != null){
            this.destinationsDB.remove(myID);
        }
        return this.destinationsDB.remove(myID);

    }
}
