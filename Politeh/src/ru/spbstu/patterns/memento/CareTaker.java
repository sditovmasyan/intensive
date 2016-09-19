package ru.spbstu.patterns.memento;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by sergey.tovmasyan on 19/09/16.
 */
public class CareTaker {
    private List<Memento> mementoList = new ArrayList<Memento>();

    public void add(Memento state){
        mementoList.add(state);
    }

    public Memento get(int index){
        return mementoList.get(index);
    }


}
