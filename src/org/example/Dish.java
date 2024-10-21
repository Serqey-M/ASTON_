package org.example;

public class Dish {
    public int amountFood;

    public Dish (int amountFood){
        this.amountFood = amountFood;
    }

    public int fill (int quantity){
        amountFood += quantity;
       return amountFood;
    }
}
