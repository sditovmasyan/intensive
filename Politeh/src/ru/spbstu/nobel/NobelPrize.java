package ru.spbstu.nobel;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;

/**
 * Created by sergey.tovmasyan on 15/09/16.
 */
public class NobelPrize {
    private int year;
    private String discipline;
    private String name;

    public NobelPrize(int year, String discipline, String name) {
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
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        NobelPrize that = (NobelPrize) o;

        if (year != that.year) return false;
        if (discipline != null ? !discipline.equals(that.discipline) : that.discipline != null) return false;
        return name != null ? name.equals(that.name) : that.name == null;

    }

    @Override
    public int hashCode() {
        int result = year;
        result = 31 * result +
                (discipline != null ?
                        discipline.hashCode()
                        : 0);
        result = 31 * result + (
                name != null ?
                        name.hashCode()
                        : 0);
        return result;
    }

    @Override
    public String toString() {
        return name + " " + year + " " + discipline;
    }
}
