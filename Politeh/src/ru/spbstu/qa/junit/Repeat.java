package ru.spbstu.qa.junit;


import org.junit.Rule;
import org.junit.rules.TestRule;
import org.junit.runner.Description;
import org.junit.runners.model.Statement;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * Created by sergey.tovmasyan on 23/09/16.
 */
public class Repeat implements TestRule {
    public int times;

    @Override
    public Statement apply(Statement statement, Description description) {
        Statement result = statement;
        Rule repeat = description.getAnnotation(Rule.class);
        if (repeat != null) {
            times = repeat.times();
            result = new RepeatStatement(times,statement);
        }
        return result;
    }

    @Retention(RetentionPolicy.RUNTIME)
    @Target(ElementType.METHOD)
    public @interface Rule{
        int times();
    }

    private class RepeatStatement extends Statement {
        private final int times;
        private final Statement statement;

        private RepeatStatement(int times,Statement statement) {
            this.times = times;
            this.statement = statement;
        }


        @Override
        public void evaluate() throws Throwable {
            for (int i=0; i<times; i++) {
                statement.evaluate();
            }
        }
    }
}
