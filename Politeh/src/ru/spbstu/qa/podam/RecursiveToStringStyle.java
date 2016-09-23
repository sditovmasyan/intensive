package ru.spbstu.qa.podam;

import org.apache.commons.lang3.SystemUtils;
import org.apache.commons.lang3.builder.ReflectionToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Collection;

/**
 * Created by sergey.tovmasyan on 23/09/16.
 */
public class RecursiveToStringStyle extends ToStringStyle {
    private static final long serialVersionUID = 1L;
    private int offset;

    public RecursiveToStringStyle() {
        this(0);
    }

    private RecursiveToStringStyle(int offset) {
        setUseShortClassName(true);
        setUseFieldNames(true);
        setUseIdentityHashCode(false);
        this.offset = offset;
        String off = "";
        for (int i = 0; i < offset; i++)
            off += "\t";
        this.setContentStart("[");
        this.setFieldSeparator(SystemUtils.LINE_SEPARATOR + off + "  ");
        this.setFieldSeparatorAtStart(true);
        this.setContentEnd(SystemUtils.LINE_SEPARATOR + off + "]");
    }

    protected void appendDetail(StringBuffer buffer, String fieldName,
                                Collection<?> col) {
        buffer.append('[');
        for (Object obj : col) {
            buffer.append(ReflectionToStringBuilder.toString(obj,
                    new RecursiveToStringStyle(offset + 1)));
            buffer.append(',');
        }
        if (buffer.charAt(buffer.length() - 1) == ',')
            buffer.setCharAt(buffer.length() - 1, ']');
    }

    protected void appendDetail(StringBuffer buffer, String fieldName,
                                Object value) {
        if (value instanceof String) {
            buffer.append("\"" + value.toString() + "\"");
        } else if (value instanceof BigDecimal) {
            buffer.append(value.getClass().getSimpleName() + "["
                    + value.toString() + "]");
        } else if (value instanceof BigInteger) {
            buffer.append(value.getClass().getSimpleName() + "["
                    + value.toString() + "]");
        } else if (!value.getClass().getName().startsWith("java.lang.")) {
            try {
                buffer.append(ReflectionToStringBuilder.toString(value,
                        new RecursiveToStringStyle(offset + 1)));
            } catch (Throwable t) {
            }
        } else {
            super.appendDetail(buffer, fieldName, value);
        }
    }
}