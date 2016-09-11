package ru.spbstu.oop.inkaps.two;

import ru.spbstu.oop.inkaps.one.Developer;

/**
 * Created by sergey.tovmasyan on 10/09/16.
 */
public class JavaDeveloper extends Developer {

    public static void main(String[] args) {
        JavaDeveloper javaDeveloper
                = new JavaDeveloper();

        javaDeveloper.createTopicOnStackOverflow();
        javaDeveloper.improveSkills();
    }

}
