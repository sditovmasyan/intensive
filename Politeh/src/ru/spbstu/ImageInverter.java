package ru.spbstu;

import org.apache.commons.io.FileUtils;

import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

/**
 * Created by sergey.tovmasyan on 17/09/16.
 */
public enum ImageInverter {
    INSTANCE;

    public void invert(File fileFrom) throws IOException {
        BufferedImage buf = ImageIO.read(fileFrom);
        for (int x = 0; x < buf.getWidth(); x++) {
            for (int y = 0; y < buf.getHeight(); y++) {
                buf.setRGB(x, y,
                        invertColor(
                                new Color(buf.getRGB(x, y), true)
                        ).getRGB());
            }
        }
        File outputFile = new File("inverted_" + fileFrom.getName());
        ImageIO.write(buf, "jpg", outputFile);
    }

    private Color invertColor(Color color) {
        return new Color(255 - color.getRed(),
                255 - color.getGreen(),
                255 - color.getBlue());
    }

    public static void main(String[] args) throws IOException {
        ImageInverter.INSTANCE.invert(new File("babbl.jpg"));
    }
}
