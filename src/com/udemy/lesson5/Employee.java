package com.udemy.lesson5;

/**
 * Created by Gürkan on 3.5.2015.
 */
abstract public class Employee {
    private int id;
    private String name;
    private String department;
    private boolean working;

    public Employee() {
    }


    public Employee(int id, String name, String department, boolean working) {
        super();
        this.id = id;
        this.name = name;
        this.department = department;
        this.working = working;
    }


    public abstract void performDuties();
    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", department='" + department + '\'' +
                ", working=" + working +
                '}';
    }
}
