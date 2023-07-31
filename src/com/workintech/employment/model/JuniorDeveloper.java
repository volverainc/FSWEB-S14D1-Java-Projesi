package com.workintech.employment.model;

public class JuniorDeveloper extends Employee{
    public JuniorDeveloper(int id, String name, double salary) {
        super(id, name, salary);
    }

    @Override
    public void work() {
        System.out.println(getName() + "Junior Developer starts working");
        setSalary(100);
    }


}
