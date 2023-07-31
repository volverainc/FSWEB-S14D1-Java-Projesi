package com.workintech.employment.model;

public class SeniorDeveloper extends Employee{
    public SeniorDeveloper(int id, String name, double salary) {
        super(id, name, salary);
    }

    public void work() {
        System.out.println(getName() + "Senior Developer starts working");
        setSalary(400);
    }


}
