package org.example.homework_30.task_abstract_factory;

public class ElectricCar implements Engine{
    @Override
    public void powerReserve() {
        System.out.println("Показывает заряд батареи");
    }
}
