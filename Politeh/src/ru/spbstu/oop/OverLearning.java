package ru.spbstu.oop;

/**
 * Created by sergey.tovmasyan on 10/09/16.
 */
public class OverLearning {
    public void aaa() {
        System.out.println("nothing");
    }

    public void aaa(int a){
        System.out.println(a);
    }

    public void aaa(int a, int b){
        aaa(a+b);
    }

    @Override
    public boolean equals(Object obj) {
        return true;
    }

    public static void main(String[] args) {
        OverLearning overLearning = new OverLearning();
        overLearning.aaa();
    }
}
