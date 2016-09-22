package ru.spbstu.reflection;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;

/**
 * Created by sergey.tovmasyan on 21/09/16.
 */
public class AnnotExample {
    @Student(firstName = "Masha",
            age = 22,
            studentID = 100500)
    public StudentObject student;

    @FXML
    public Button doLogin;

    @FXML
    public Label login;

    @FXML
    public Label password;


    public static void main(String[] args) {
        AnnotExample example = new AnnotExample();
        example.doLogin.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                System.out.println("aaa");
            }
        });
    }

}
