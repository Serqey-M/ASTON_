package org.example;

public class Animal {
    public String name;
    public int max_run = -1;
    public int max_swim = -1;
    public static int countAmimal = 0;

    public Animal(String _name) {
        this.name = _name;
        countAmimal++;
    }

    public void run(int distance) {
        if (distance > max_run && max_run > -1) {
            distance = max_run;
        }
        System.out.println(name + " пробежал " + distance + " м.");
    }

    public void swim(int distance) {
        if (distance > max_swim && max_run > -1) {
            distance = max_swim;
        }
        System.out.println(name + " проплыл " + distance + " м.");
    }
}

