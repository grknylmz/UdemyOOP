package com.udemy.lesson5;

/**
 * Created by Gürkan on 3.5.2015.
 */
public class Nurse extends Employee {

    public Nurse(){}

    public Nurse(int id, String name, String department, boolean working) {
        super(id, name, department, working);
        System.out.println("Nurse in action...");
    }

    @Override
    public void performDuties() {
        cleanPatientArea();
        drowBlood();
        cleanPatientArea();

    }


    //Nurses

    private void checkVitalSigns(){
        System.out.println("Checking vital signs");
    }

    private void drowBlood(){
        System.out.println("Drowing blood...");
    }

    private void cleanPatientArea(){
        System.out.println("cleaning Patient Area");
    }

}
