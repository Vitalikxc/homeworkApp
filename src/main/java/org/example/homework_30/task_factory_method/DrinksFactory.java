package org.example.homework_30.task_factory_method;

public abstract class DrinksFactory {

    public abstract Drinks createDrink();

    public void getDrink(){
        Drinks takeDrink = createDrink();
        takeDrink.drink();
    }
}
