package com.udemy.lesson1;

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

        Human joe = new Human();
        joe.age = 36;
        joe.eyeColor = "Green";
        joe.name = "Joe Greensilk";
        joe.heightInches = 68;

        joe.speak();
        joe.eat();

    }
}
