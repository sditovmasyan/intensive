package ru.spbstu.reflection;

import java.io.Serializable;
import java.lang.reflect.*;

/**
 * Created by sergey.tovmasyan on 21/09/16.
 */
public class Example  {
    public int a = 0;
    public String d ="bb";
    private String b = "aaa";

    private void print(String ggg) {
        System.out.println(this.toString() + "  " + ggg);
    }


    public static void main(String[] args) throws Exception {
        Example obj =  new Example();
        Class clazz = obj.getClass();

        //System.out.println(obj);

        Field field = clazz.getDeclaredField("b");
        field.setAccessible(true);
        field.set(obj,"fjfjfjhf");

        //System.out.println(obj);

        Method aaa = clazz.getDeclaredMethods()[0];
        aaa.setAccessible(true);
        aaa.invoke(obj,new String("ghdghdhgdh"));



        /**System.out.println(clazz.getName());
        System.out.println(clazz.getCanonicalName());
        System.out.println(clazz.getSimpleName());
        System.out.println(clazz.getTypeName());

        int modifiers = clazz.getModifiers();
        System.out.println(modifiers);
        System.out.println(Modifier.isFinal(modifiers));
        System.out.println(clazz.getSuperclass().getSimpleName());

        for (Class interfaze : clazz.getInterfaces()) {
            System.out.println(interfaze.getSimpleName());
        } */

    }

    @Override
    public String toString() {
        return "Example{" +
                "a=" + a +
                ", d='" + d + '\'' +
                ", b='" + b + '\'' +
                '}';
    }
}
