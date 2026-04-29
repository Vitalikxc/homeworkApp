package org.example.homework_30;

import org.example.homework_30.task_abstract_factory.ElectricCar;
import org.example.homework_30.task_abstract_factory.Engine;
import org.example.homework_30.task_abstract_factory.GasolineCar;
import org.example.homework_30.task_builder.Person;
import org.example.homework_30.task_factory_method.CoffeeFactory;
import org.example.homework_30.task_factory_method.DrinksFactory;
import org.example.homework_30.task_factory_method.TeaFactory;
import org.example.homework_30.task_prototype.User;
import org.example.homework_30.task_proxy_pattern.Music;
import org.example.homework_30.task_proxy_pattern.ProxyMusic;
import org.example.homework_30.task_singleton.Singleton;

public class Main {
    public static void main(String[] args) {
        //Singleton
        Singleton singletonOne = Singleton.getInstance();
        Singleton singletonTwo = Singleton.getInstance();
        System.out.println(singletonTwo.equals(singletonOne));

        //Abstract factory
        Engine electricEngine = new ElectricCar();
        Engine gasolineEngine = new GasolineCar();
        electricEngine.powerReserve();
        gasolineEngine.powerReserve();

        //Factory method
        DrinksFactory drinksFactory;
        drinksFactory = new CoffeeFactory();
        drinksFactory.getDrink();

        drinksFactory = new TeaFactory();
        drinksFactory.getDrink();

        //Builder
        Person personOne = new Person.Builder("Tom", "One").age(25).build();
        Person personTwo = new Person.Builder("Bob", "Two").build();
        System.out.println(personOne);
        System.out.println(personTwo);

        //Prototype
        User userOne = new User("John" ,"One" , 25);
        User userTwo = userOne.clone();
        userTwo.setName("Alex");
        userTwo.setAge(10);
        System.out.println(userOne);
        System.out.println(userTwo);

        //Proxy
        Music music = new ProxyMusic("12345");
        music.play();
        music.play();
    }
}
