package ru.spbstu.patterns.state;

/**
 * Created by sergey.tovmasyan on 19/09/16.
 */
public class StartState implements State {

    public void doAction(Context context) {
        System.out.println("Player is in start state");
        context.setState(this);
    }

    public String toString() {
        return "Start State";
    }
}