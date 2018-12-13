package com.company;

public class Cage <T extends Animal>{

    private  T animal;

    Cage(T ob){
        this.animal= ob;
    }

    public T getAnimal() {
        return animal;
    }
}
