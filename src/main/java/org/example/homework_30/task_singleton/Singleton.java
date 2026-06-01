package org.example.homework_30.task_singleton;

public class Singleton {
    private static Singleton instance;
    public String value;

    public static Singleton getInstance(){
        if (instance == null){
            instance = new Singleton();
        }
        return instance;
    }
}
