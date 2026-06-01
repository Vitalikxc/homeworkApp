package org.example.homework_30.task_factory_method;

public class TeaFactory extends DrinksFactory{
    @Override
    public Drinks createDrink() {
        return new Tea();
    }
}
