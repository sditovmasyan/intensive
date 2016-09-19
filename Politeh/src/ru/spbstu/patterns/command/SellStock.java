package ru.spbstu.patterns.command;

/**
 * Created by sergey.tovmasyan on 19/09/16.
 */
public class SellStock implements Order {
    private Stock abcStock;

    public SellStock(Stock abcStock) {
        this.abcStock = abcStock;
    }

    public void execute() {
        abcStock.sell();
    }
}
