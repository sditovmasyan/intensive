package ru.spbstu.collections;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;

/**
 * Created by sergey.tovmasyan on 14/09/16.
 */
public class EqHashObj {
    private Integer a;
    private Integer b;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        EqHashObj eqHashObj = (EqHashObj) o;

        if (a != null ? !a.equals(eqHashObj.a) : eqHashObj.a != null) return false;
        return b != null ? b.equals(eqHashObj.b) : eqHashObj.b == null;

    }

    @Override
    public int hashCode() {
        int result = a != null ? a.hashCode() : 0;
        result = 31 * result + (b != null ? b.hashCode() : 0);
        return result;
    }
}
