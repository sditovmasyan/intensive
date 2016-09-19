package ru.spbstu.patterns.singleton;

/**
 * Created by sergey.tovmasyan on 17/09/16.
 */
public enum  EnumExamples {
    RUSSIA(7),
    GHANA(267) ,
    USA(1) ,
    CHINA(3);

    private int code;

    EnumExamples(int i) {
        this.code = i;
    }

    public int getCode() {
        return code;
    }

    public static void main(String[] args) {
        for(EnumExamples example :
                EnumExamples.values()) {
            System.out.println(example.name()
                    + " " + example.getCode());
        }
    }
}
