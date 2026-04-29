package org.example.homework_30.task_abstract_factory;

public class GasolineCar implements Engine{
    @Override
    public void powerReserve() {
        System.out.println("Показывает количество топлива");
    }
}
