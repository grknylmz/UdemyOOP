package com.udemy.lesson5;

/**
 * Created by G�rkan on 3.5.2015.
 */
public class EmergencyRoomProcess {
    public static void main(String[] args) {
        HospitalManagement ERDirector= new HospitalManagement();
        Employee yonca = new Nurse(1,"Yonca" , "emergency" , true);
        Employee gurkan = new Doctor(1, "Gurkan "  , "Emergency" , true);
        ERDirector.callUpon(yonca);

    }
}
