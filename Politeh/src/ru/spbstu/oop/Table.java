package ru.spbstu.oop;

import java.awt.*;

/**
 * Created by sergey.tovmasyan on 09/09/16.
 */
public class Table {
    int material;
    int legs;
    Color color;
    String country;
    int countryCode;


    public Table(int legs) {
        this.legs = legs;
    }

    public Table(int legs, String country) {
        this.legs = legs;
        this.country = country;
    }

    public Table(int material, int legs, Color color, String country, int countryCode) {
        this.material = material;
        this.legs = legs;
        this.color = color;
        this.country = country;
        this.countryCode = countryCode;
    }

    public static void main(String[] args) {
        Table firstTable = new Table(4);
        Table secondTable = new Table(1,4,Color.black,"Italy",12);
        System.out.println(secondTable.legs);
        System.out.println(secondTable.color);
    }

}
