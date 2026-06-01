package org.example.homework_30.task_factory_method;

public class CoffeeFactory extends DrinksFactory{
    @Override
    public Drinks createDrink() {
        return new Coffee();
    }
}
