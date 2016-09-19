package ru.spbstu.patterns.memento;

/**
 * Created by sergey.tovmasyan on 19/09/16.
 */
public class Memento {
    private String state;

    public Memento(String state){
        this.state = state;
    }

    public String getState(){
        return state;
    }
}
