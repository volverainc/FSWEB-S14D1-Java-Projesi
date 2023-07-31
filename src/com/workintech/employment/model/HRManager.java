package com.workintech.employment.model;

public class HRManager extends Employee{
    private JuniorDeveloper[] juniorDevelopers;
    private MidDeveloper[] midDevelopers;
    private SeniorDeveloper[] seniorDevelopers;
    public HRManager(int id, String name, double salary, JuniorDeveloper[] juniorDevelopers, MidDeveloper[] midDevelopers, SeniorDeveloper[] seniorDevelopers){
        super(id,name,salary);
        this.seniorDevelopers = seniorDevelopers;
        this.midDevelopers = midDevelopers;
        this.juniorDevelopers = juniorDevelopers;
    }

    public void addEmployee(int index, JuniorDeveloper junior) {
    try{
        if(juniorDevelopers[index] == null) {
            juniorDevelopers[index] = junior;
        }
    } catch (ArrayIndexOutOfBoundsException ex) {
        System.out.println("Index not found " + ex.getMessage());
    }
    }

    public void addEmployee(int index, MidDeveloper mid) {
        try{
            if(midDevelopers[index] == null) {
                midDevelopers[index] = mid;
            }
        } catch (ArrayIndexOutOfBoundsException ex) {
            System.out.println("Index not found " + ex.getMessage());
        }
    }

    public void addEmployee(int index, SeniorDeveloper senior) {
        try{
            if(seniorDevelopers[index] == null) {
                seniorDevelopers[index] = senior;
            }
        } catch (ArrayIndexOutOfBoundsException ex) {
            System.out.println("Index not found " + ex.getMessage());
        }
    }

    public JuniorDeveloper[] getJuniorDevelopers() {
        return juniorDevelopers;
    }

    public MidDeveloper[] getMidDevelopers() {
        return midDevelopers;
    }

    public SeniorDeveloper[] getSeniorDevelopers() {
        return seniorDevelopers;
    }

    public void work() {
        System.out.println(getName() + "HR Manager starts working");
        setSalary(300);
    }
}
