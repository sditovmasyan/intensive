package ru.spbstu.nobel;

import org.apache.commons.io.FileUtils;

import java.io.File;
import java.io.IOException;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by sergey.tovmasyan on 15/09/16.
 */
public class NobelParser {

    public static List<NobelPrize> getNobelPrizes() throws IOException {
        return getNobelPrizes(new File("nobel.csv"));
    }

    public static List<NobelPrize> getNobelPrizes(File file) throws IOException {

        List<String> list = FileUtils.readLines(
                file, Charset.defaultCharset());

        List<NobelPrize> nobels = new ArrayList<>();

        for (int i = 1; i < list.size(); i++) {
            try {
                String line = list.get(i);
                String[] arr = line.split(",");
                int year = Integer.parseInt(arr[0]);
                String discipline = arr[1];
                String name = arr[4] + " " + arr[5];
                nobels.add(new NobelPrize(year, discipline, name.replace("\""," ")));
            } catch (NumberFormatException e) {
                System.err.println("There was a problem with index " + i);
            }
        }
        return nobels;
    }

}
