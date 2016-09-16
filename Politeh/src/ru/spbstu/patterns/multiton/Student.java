package ru.spbstu.patterns.multiton;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by sergey.tovmasyan on 16/09/16.
 */
public class Student {
    private static Map<StudentName, Student> students;

    private StudentName name;

    static {
        students = new HashMap<>();
        students.put(StudentName.ANDREY, new Student(StudentName.ANDREY));
        students.put(StudentName.MASHA, new Student(StudentName.MASHA));
        students.put(StudentName.SASHA, new Student(StudentName.SASHA));
        students.put(StudentName.SERGEY, new Student(StudentName.SERGEY));
    }

    public Student(StudentName name) {
        this.name = name;
    }

    public static Student getInstance(StudentName name) {
        return students.get(name);
    }

    public StudentName getName() {
        return name;
    }
}
