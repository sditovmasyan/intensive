package ru.spbstu.patterns.chainofrespobsibility;

/**
 * Created by sergey.tovmasyan on 19/09/16.
 */
public class FileLogger extends AbstractLogger {

    public FileLogger(int level){
        this.level = level;
    }

    @Override
    protected void write(String message) {
        System.out.println("File::Logger: " + message);
    }
}
