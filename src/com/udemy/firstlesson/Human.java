package com.udemy.firstlesson;

/**
 * Created by Gürkan on 22.4.2015.
 */
public class Human {

    String name;
    int age;
    int heightInches;
    String eyeColor;

    public Human(){

    }
    public Human(String name ,int  age ,int heightInches , String eyeColor){
        this.name = name;
        this.age = age;
        this.heightInches = heightInches;
        this.eyeColor = eyeColor;

    }

    public void speak(){
        System.out.println("Hello my name is" + name);
        System.out.println("I am " + heightInches + "inches tll");
        System.out.println("I am " + age + "years old");
        System.out.println("My eyecolor is " + eyeColor);
    }

    public void eat(){
        System.out.println("eating ... ");
    }

    public void walk(){
        System.out.println("walking...");
    }

    public void work(){
        System.out.println("working...");
    }



}
