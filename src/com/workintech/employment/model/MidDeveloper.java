package com.workintech.employment.model;

public class MidDeveloper extends Employee{
    public MidDeveloper(int id, String name, double salary) {
        super(id, name, salary);
    }

    public void work() {
        System.out.println(getName() + "Mid Developer starts working");
        setSalary( 200);
    }

}
