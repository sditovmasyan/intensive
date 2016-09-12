package ru.spbstu.exceptions;

/**
 * Created by sergey.tovmasyan on 11/09/16.
 */
public class FinallyDemo {

    /**
     * В этом примере в методе procA из-за возбуждения исключения происходит преждевременный выход из блока try,
     * но по пути «наружу» выполняется раздел finally. Другой метод procB завершает работу
     * выполнением стоящего в try-блоке оператора return,
     * но и при этом перед выходом из метода выполняется программный код блока finally.
     */

    static void procA() {
        try {
            System.out.println("inside procA");
            throw new RuntimeException("demo");
        } finally {
            System.out.println("procA's finally");
        }
    }
    static void procB() {
        try {
            System.out.println("inside procB");
            return;
        } finally {
            System.out.println("procB's finally");
        }
    }
    public static void main(String args[]) {
        try {
            procA();
        } catch (Exception e) {
        }
        procB();
    }


}
