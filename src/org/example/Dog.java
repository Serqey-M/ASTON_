package org.example;

public class Dog extends Animal {
    public static int countDog = 0;

    public Dog(String _name) {
        super(_name);
        max_run = 500;
        max_swim = 10;
        countDog++;

    }

}
