package ru.spbstu.patterns.command;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by sergey.tovmasyan on 19/09/16.
 */
public class Broker {
    private List<Order> orderList = new ArrayList<Order>();

    public void takeOrder(Order order) {
        orderList.add(order);
    }

    public void placeOrders() {

        for (Order order : orderList) {
            order.execute();
        }
        orderList.clear();
    }
}
