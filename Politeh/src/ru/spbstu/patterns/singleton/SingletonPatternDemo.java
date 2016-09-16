package ru.spbstu.patterns.singleton;

/**
 * Created by sergey.tovmasyan on 16/09/16.
 */
public class SingletonPatternDemo {
    public static void main(String[] args) {
        StaticField1 staticField1 = StaticField1.INSTANCE;
        EnumSingleton2 enumSingleton2 = EnumSingleton2.INSTANCE;
        SynchronizedAccessor3 synchronizedAccessor3 = SynchronizedAccessor3.getInstance();
        DoubleCheckedAndVolatile4 doubleCheckedAndVolatile4 = DoubleCheckedAndVolatile4.getInstance();
        OnDemandHolder5 onDemandHolder5 = OnDemandHolder5.getInstance();

        StaticField1 staticField1_2 = StaticField1.INSTANCE;
        EnumSingleton2 enumSingleton2_2 = EnumSingleton2.INSTANCE;
        SynchronizedAccessor3 synchronizedAccessor3_2 = SynchronizedAccessor3.getInstance();
        DoubleCheckedAndVolatile4 doubleCheckedAndVolatile4_2 = DoubleCheckedAndVolatile4.getInstance();
        OnDemandHolder5 onDemandHolder5_2 = OnDemandHolder5.getInstance();

        System.out.println(staticField1 == staticField1_2);
        System.out.println(enumSingleton2 == enumSingleton2_2);
        System.out.println(synchronizedAccessor3 == synchronizedAccessor3_2);
        System.out.println(doubleCheckedAndVolatile4 == doubleCheckedAndVolatile4_2);
        System.out.println(onDemandHolder5 == onDemandHolder5_2);
    }
}
