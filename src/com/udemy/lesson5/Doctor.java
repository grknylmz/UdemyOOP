package com.udemy.lesson5;

/**
 * Created by Gürkan on 3.5.2015.
 */
public class Doctor extends  Employee{
    public Doctor(int id, String name, String department, boolean working) {
        super(id, name, department, working);
        System.out.println("Doctor is in action ...");
    }

    @Override
    public void performDuties() {
        presciribeMedicine();
        diagnosePatients();
    }

    //Doctor
    private void presciribeMedicine(){
        System.out.println("Prescribe Medicine ... ");
    }

    private void diagnosePatients(){
        System.out.println("Diagnosing Patient ... ");
    }

}
