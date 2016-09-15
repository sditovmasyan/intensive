package ru.spbstu.exceptions.custom;

/**
 * Created by sergey.tovmasyan on 12/09/16.
 */
public class DebugExample {
    public static final String BMW = "BMW";

    public static void main(String[] args) {
        String model = "";
        model = model + DebugExample.BMW;
        Car car = new Car(model);
        car.getModel();
    }

    static class Car {
        String model;

        public Car(String model) {
            this.model = model;
        }

        public String getModel() {
            int a = 0;
            a++;
            int b = a + 5;
            System.out.println(b);
            return model;
        }
    }
}
