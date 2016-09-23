package ru.spbstu.qa.podam;

import org.apache.commons.lang3.builder.ReflectionToStringBuilder;
import ru.spbstu.qa.podam.model.Country;
import uk.co.jemos.podam.api.PodamFactory;
import uk.co.jemos.podam.api.PodamFactoryImpl;

/**
 * Created by sergey.tovmasyan on 23/09/16.
 */
public class CountryCreatorSimple {
    public static void main(String[] args) {
        /** Создаём фабрику */
        PodamFactory factory = new PodamFactoryImpl();
        /** Генерим страну */
        Country myPojo = factory.manufacturePojo(Country.class);
        /** "Печатаем" страну */
        System.out.println(ReflectionToStringBuilder.toString(myPojo,new RecursiveToStringStyle()));
    }
}
