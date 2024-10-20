package org.example;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Animal anim = new Animal("Бобик");
        anim.max_run = 200;
        System.out.println(anim.max_run);
        anim.run(150);

        Dog dog1 = new Dog("Шарик");
        dog1.run(700);


    }

}