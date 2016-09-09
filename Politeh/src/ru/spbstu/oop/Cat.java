package ru.spbstu.oop;

import java.io.Serializable;
import java.rmi.Remote;

/**
 * Created by sergey.tovmasyan on 09/09/16.
 */
public class Cat extends Animal implements Cloneable,Serializable,Remote {

    private String name;

    public Cat(String name) {
        this.name = name;
    }

    @Override
    void makeSound() {
        System.out.println("Myau");
    }

    @Override
    public String toString() {
        return "Cat{" +
                "name='" + name + '\'' +
                '}';
    }

    public static void main(String[] args) {
        Animal animal = new Cat("Pushistik");
        animal.makeSound();

        System.out.println(animal);
    }
}
