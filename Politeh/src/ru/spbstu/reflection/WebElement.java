package ru.spbstu.reflection;

/**
 * Created by sergey.tovmasyan on 21/09/16.
 */
public class WebElement {
    private String id;
    private String path;

    private String text;

    public void setText(String text) {
        this.text = text;
    }

    public String getText() {
        return text;
    }

    public void doClick() {
        //some logic to click on element
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }

    @Override
    public String toString() {
        return "WebElement{" +
                "id='" + id + '\'' +
                ", path='" + path + '\'' +
                ", text='" + text + '\'' +
                '}';
    }
}
