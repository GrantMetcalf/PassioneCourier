package com.PassioneCourier.group2.repository;

public interface  IRepository<Type, ID> {

    Type create(Type t);
    Type read(ID myID);
    Type update(Type t);
    boolean delete(ID myID);

}
