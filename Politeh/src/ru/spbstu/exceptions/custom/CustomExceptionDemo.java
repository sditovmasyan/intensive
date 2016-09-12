package ru.spbstu.exceptions.custom;

import java.util.logging.Level;
import java.util.logging.LogRecord;
import java.util.logging.Logger;

/**
 * Created by sergey.tovmasyan on 11/09/16.
 */
public class CustomExceptionDemo {
    public static void main(String[] args) throws MyException {

        int result = 0;

        try{
            result = getAreaValue(-1, 100);
        }catch(IllegalArgumentException e){
            Logger.getLogger(CustomExceptionDemo.class.getName()).log(new LogRecord(Level.WARNING, "В метод вычисления площади был передан аргумент с негативным значением!"));
            throw new MyException(e);
        }
        System.out.println("Result is : "+result);
    }

    public static int getAreaValue(int x, int y){
        if(x < 0 || y < 0) throw new IllegalArgumentException("value of 'x' or 'y' is negative: x="+x+", y="+y);
        return x*y;
    }
}
