package com.udemy.firstlesson;

/**
 * Created by Gürkan on 22.4.2015.
 */
public class Earth {
    public static void main(String[] args)  {
        Human tom;
        tom = new Human();

        tom.age = 17;
        tom.eyeColor="brown";
        tom.heightInches = 25;
        tom.name = "Tom Zabo";

        tom.speak();
        tom.eat();


    }
}
