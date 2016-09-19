package ru.spbstu.patterns.state;

/**
 * Created by sergey.tovmasyan on 19/09/16.
 */
public class Context {
    private State state;

    public Context(){
        state = null;
    }

    public void setState(State state){
        this.state = state;
    }

    public State getState(){
        return state;
    }
}
