package ru.spbstu.reflection;

import java.lang.reflect.Field;

/**
 * Created by sergey.tovmasyan on 21/09/16.
 */
public class PageProcessor {
    public static void process(Object object) throws IllegalAccessException {
        Class clazz = object.getClass();

        for (Field field : clazz.getDeclaredFields()) {
            field.setAccessible(true);
            WebElement webElement = new WebElement();
            if (field.isAnnotationPresent(FindBy.class)) {
                FindBy findBy = field.getAnnotation(FindBy.class);
                String id = findBy.id();
                String path = findBy.path();
                webElement.setId(id);
                webElement.setPath(path);
            }

            field.set(object,webElement);
        }
    }
}
