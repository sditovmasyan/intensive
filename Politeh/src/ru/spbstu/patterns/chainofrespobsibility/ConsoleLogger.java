package ru.spbstu.patterns.chainofrespobsibility;

/**
 * Created by sergey.tovmasyan on 19/09/16.
 */
public class ConsoleLogger extends AbstractLogger {

    public ConsoleLogger(int level){
        this.level = level;
    }

    @Override
    protected void write(String message) {
        System.out.println("Standard Console::Logger: " + message);
    }
}
