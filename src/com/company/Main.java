package com.company;

public class Main {

    public static void main(String[] args) {
        Animal animal1 = new Cat();
        Animal animal2 = new Dog();
        Animal animal3 = new Cat();
        Animal animal4 = new Dog();
        Animal animal5 = new Cat();
        Animal animal6 = new Dog();

        Cage<Cat> cage1 = new Cage(animal1);
        Cage<Dog> cage2 = new Cage(animal2);


        Cat cat1 = cage1.getAnimal();
        Dog dog2 = cage2.getAnimal();
    }
}
