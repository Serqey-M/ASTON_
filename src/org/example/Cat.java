package org.example;

public class Cat extends Animal {
    public static int countCat = 0;
    public int hunger;
    public boolean full;

    public Cat(String _name, int hunger) {
        super(_name);
        max_run = 200;
        max_swim = 0;
        countCat++;
        this.hunger = hunger;
        if (hunger == 0) {
            full = true;
        }
        else {full = false;}
        }


    public int eating (Dish dish){
        if (dish.amountFood >= hunger){
            dish.amountFood -= hunger;
            hunger = 0;
            full = true;
        }
        return hunger;
    }

}
