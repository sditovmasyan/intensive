package ru.spbstu.exceptions.several;

import org.apache.commons.lang3.exception.ExceptionUtils;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/**
 * Created by sergey.tovmasyan on 11/09/16.
 */
public class SeveralExceptions {
    public static void main(String[] args) {
        String fileName = "aaa.txt";

        FileInputStream fis = null;
        try{
            fis = new FileInputStream(fileName);
        }catch (FileNotFoundException ex){
            System.out.println("Oops, FileNotFoundException caught");
        }catch (IOException e) {
            System.out.println("Oops, something went wrong with file");
        }



    }
 /**   Так нельзя, - только от частного к общему
    try{
        fis = new FileInputStream(FILE_NAME_NOBEL);
    }catch (Exception ex){
//...
    }catch (IOException e) { // <--- Ошибка
//...
    }
  */

/** Можно так, начиная с Java 7
    try {
        ...
    } catch( IOException | SQLException ex ) {
        logger.log(ex);
        throw ex;
    } */



}
