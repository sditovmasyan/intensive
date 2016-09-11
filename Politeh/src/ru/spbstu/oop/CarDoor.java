package ru.spbstu.oop;

/**
 * Created by sergey.tovmasyan on 10/09/16.
 */
public class CarDoor implements Doorable, Cloneable {
    @Override
    public void open() {
        System.out.println("open the door");
    }

    @Override
    public void close() {
        System.out.println("close the door");
    }

    public static void main(String[] args) {
        Doorable door = new CarDoor();



        door.open();



    }
}
