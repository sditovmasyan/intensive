package ru.spbstu.patterns.bridge;

/**
 * Created by sergey.tovmasyan on 16/09/16.
 */
public class YellowCircle implements DrawAPI {
    @Override
    public void drawCircle(int radius, int x, int y) {
        System.out.println("Drawing Circle[ color: yellow, radius: " + radius + ", x: " + x + ", " + y + "]");
    }
}
