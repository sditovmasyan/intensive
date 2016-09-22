package ru.spbstu.oop;

/**
 * Created by sergey.tovmasyan on 09/09/16.
 */
public class Timer {
    public static void main(String[] args) throws InterruptedException {
        // https://polis.mail.ru/blog/show/1/
        //System.out.println("Student started. U have 7 minutes");
        for(int i=0; i<120; i++) {
            System.out.println("Passed " + i + " seconds");
            Thread.sleep(1000);
        }
        System.out.println("Student finished");
    }
}
