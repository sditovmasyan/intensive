package ru.spbstu.patterns.state;

/**
 * Created by sergey.tovmasyan on 19/09/16.
 */
public class StopState implements State {

    public void doAction(Context context) {
        System.out.println("Player is in stop state");
        context.setState(this);
    }

    public String toString(){
        return "Stop State";
    }
}
