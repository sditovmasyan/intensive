package ru.spbstu.patterns.chainofrespobsibility;

/**
 * Created by sergey.tovmasyan on 19/09/16.
 */
public class ErrorLogger extends AbstractLogger {

    public ErrorLogger(int level){
        this.level = level;
    }

    @Override
    protected void write(String message) {
        System.out.println("Error Console::Logger: " + message);
    }
}

