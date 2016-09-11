package ru.spbstu.oop.inkaps.one;

/**
 * Created by sergey.tovmasyan on 10/09/16.
 */
public class Developer {
    private int id = 0;
    protected String name = "";
    public String language = "";
    boolean male = false;

    void makeCode() {
        System.out.println("Developed some code");
    }

    public void createTopicOnStackOverflow() {
        System.out.println("Topic successfully created");
    }

    private void cry() {
        System.out.println("I'm crying");
    }

    protected void improveSkills() {
        System.out.println("JOKER conference. WOW");
    }
}
