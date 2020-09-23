package com.PassioneCourier.group2.Entity.user;


import java.io.Serializable;

public class Employer implements Serializable {

    //instance variables
    private int emp_ID;
    private String fName;
    private String lName;


    private Employer(){}


    //constructor
    private Employer(EmployerBuilder builder){

        this.emp_ID = builder.emp_ID;
        this.lName = builder.lName;
        this.fName = builder.fName;
    }

    //getters
    public int getEmployerId() {
        return emp_ID;
    }

    public String getLastName(){
        return lName;
    }

    public String getFirstName(){
        return fName;
    }

    public void assignVehicle(){

    }

    public void assignRoute(){

    }


    @Override
    public String toString() {
        return "Employer{" +
                "emp_ID=" + emp_ID +
                ", fName='" + fName + '\'' +
                ", lName='" + lName + '\'' +
                '}';
    }

    //builder
    public static class EmployerBuilder{

        //instances
        private int emp_ID;
        private String lName;
        private String fName;

        public EmployerBuilder setEmployerID(int id){
            this.emp_ID = id;
            return this;
        }

        public EmployerBuilder setLastName(String lnm){
            this.lName = lnm;
            return this;
        }

        public EmployerBuilder setFirstName(String fnm){
            this.fName = fnm;
            return this;
        }

        public EmployerBuilder(){

        }

        public EmployerBuilder(int id, String lnm, String fnm){

            this.emp_ID = id;
            this.lName = lnm;
            this.fName = fnm;
        }

        public EmployerBuilder copy(Employer myEmployer){
            this.emp_ID = myEmployer.emp_ID;
            this.lName = myEmployer.lName;
            this.fName = myEmployer.fName;
            return this;
        }
        public Employer build(){

            return new Employer(this);
        }

    }

}