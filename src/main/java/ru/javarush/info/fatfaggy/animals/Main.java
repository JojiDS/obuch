package ru.javarush.info.fatfaggy.animals;

import entities.Cat;
import entities.Dog;
import entities.Parrot;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext("entities");
        Cat cat = applicationContext.getBean(Cat.class);
        Dog dog = (Dog) applicationContext.getBean("dog");
        Parrot parrot = applicationContext.getBean("parrot - Kesha", Parrot.class);

        System.out.println(cat.getName());
        System.out.println(dog.getName());
        System.out.println(parrot.getName());
    }
}
