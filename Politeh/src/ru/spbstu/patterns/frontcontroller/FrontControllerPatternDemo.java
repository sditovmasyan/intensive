package ru.spbstu.patterns.frontcontroller;

/**
 * Created by sergey.tovmasyan on 16/09/16.
 */
public class FrontControllerPatternDemo {
    public static void main(String[] args) {
        FrontController frontController = new FrontController();
        frontController.dispatchRequest("HOME");
        frontController.dispatchRequest("STUDENT");
    }
}
