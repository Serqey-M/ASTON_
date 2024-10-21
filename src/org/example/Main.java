package org.example;

public class Main {
    public static void main(String[] args) {
        Animal anim = new Animal("Бобик");
        System.out.println("клас животные");
        anim.run(150);
        System.out.println("количество животных " + Animal.countAmimal);
        System.out.println("");

        System.out.println("клас Собака");
        Dog dog1 = new Dog("Шарик");
        dog1.run(600);
        dog1.swim(50);
        System.out.println("количество собак " + Dog.countDog);
        System.out.println("");

        System.out.println("клас кошки");
        Cat cat1 = new Cat("Барсик", 200);
        cat1.run(300);
        cat1.swim(10);
        System.out.println("количество кошек " + Cat.countCat);
        System.out.println("");

        Cat[] catArray = new Cat[10];
        catArray[0] = new Cat("муся", 8);
        catArray[1] = new Cat("багира", 50);
        catArray[2] = new Cat("сима", 2);
        catArray[3] = new Cat("мася", 30);
        catArray[4] = new Cat("манюня", 6);
        catArray[5] = new Cat("ася", 4);
        catArray[6] = new Cat("соня", 10);
        catArray[7] = new Cat("алиса", 7);
        catArray[8] = new Cat("боня", 1);
        catArray[9] = new Cat("нюша", 9);
        System.out.println("количество кошек " + Cat.countCat);
        System.out.println("количество животных " + Animal.countAmimal);
        Dish dish2 = new Dish(45);

        for (int i = 0; i < catArray.length; i++){
            catArray[i].eating(dish2);
            System.out.println(catArray[i].name + " сыт: " + catArray[i].full);
        }
    }
}