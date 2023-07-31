package com.workintech.employment.main;

import com.workintech.employment.model.*;

public class Main {
    public static void main(String[] args) {
        Employee asci = new Employee(6, "Murat",50);
        asci.work();

        JuniorDeveloper juniorDeveloper1 = new JuniorDeveloper(2, "Emre",100);
        juniorDeveloper1.work();
        JuniorDeveloper juniorDeveloper2 = new JuniorDeveloper(3,"Ali",100);
        juniorDeveloper2.work();
        JuniorDeveloper[] juniorDevelopers = new JuniorDeveloper[]{juniorDeveloper1,juniorDeveloper2};
        HRManager hrManager = new HRManager(1,"Ahmet",300,new JuniorDeveloper[3], new MidDeveloper[2], new SeniorDeveloper[1]);
    }


}
