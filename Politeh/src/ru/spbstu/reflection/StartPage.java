package ru.spbstu.reflection;

/**
 * Created by sergey.tovmasyan on 21/09/16.
 */
public class StartPage {
    @FindBy(id = "login")
    WebElement loginField;

    @FindBy(id = "password")
    WebElement passwordField;

    @FindBy(path = "/div/div/2")
    WebElement loginButton;

    public StartPage() {
        loginField = new WebElement();
        passwordField = new WebElement();
        loginButton = new WebElement();

        loginField.setId("login");
        loginField.setPath("");
        loginField.setId("login");
        loginField.setPath("");
        loginField.setId("login");
        loginField.setPath("");
    }

    public HomePage doLogin() {
        return doLogin("admin", "admin_pass");
    }

    public HomePage doLogin(String un, String pass) {
        loginField.setText(un);
        passwordField.setText(pass);
        loginButton.doClick();
        return new HomePage();
    }

    public static void main(String[] args) throws IllegalAccessException {
        StartPage startPage = new StartPage();
        PageProcessor.process(startPage);

        System.out.println(startPage.loginButton);


    }


}
