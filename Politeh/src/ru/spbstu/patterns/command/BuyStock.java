package ru.spbstu.patterns.command;

/**
 * Created by sergey.tovmasyan on 19/09/16.
 */
public class BuyStock implements Order {
    private Stock abcStock;

    public BuyStock(Stock abcStock){
        this.abcStock = abcStock;
    }

    public void execute() {
        abcStock.buy();
    }
}
