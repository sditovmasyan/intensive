package ru.spbstu.collections;

import org.apache.commons.io.FileUtils;

import java.io.File;
import java.io.IOException;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by sergey.tovmasyan on 14/09/16.
 */
public class ArrayListTouch {
    public static void main(String[] args) throws IOException {
        File nobel = new File("nobel.csv");
        List<String> list = FileUtils.readLines(
                nobel, Charset.defaultCharset());

        List<Nobel> nobels = new ArrayList<>();

        for (int i=1; i< list.size(); i++) {
            try {
                String line = list.get(i);
                String[] arr = line.split(",");
                int year = Integer.parseInt(arr[0]);
                String discipline = arr[1];
                String name = arr[4] + " " + arr[5];
                nobels.add(new Nobel(year, discipline, name));
            } catch (NumberFormatException e) {
                System.err.println("There was a problem with index " + i);
            }
        }


        nobels.forEach(nob -> System.out.println(nob));
    }

    private static class Nobel {
        private int year;
        private String discipline;
        private String name;

        public Nobel(int year, String discipline, String name) {
            this.year = year;
            this.discipline = discipline;
            this.name = name;
        }

        public int getYear() {
            return year;
        }

        public String getDiscipline() {
            return discipline;
        }

        public String getName() {
            return name;
        }

        @Override
        public String toString() {
            return name + " " + year + " " + discipline;
        }
    }
}
