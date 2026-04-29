package org.example.homework_30.task_builder;

public class Person {
    String name;
    String surname;
    int age;

    public Person(Builder builder) {
        this.name = builder.name;
        this.surname = builder.surname;
        this.age = builder.age;
    }

    @Override
    public String toString() {
        return "Имя: " + name + " Фамилия: " + surname + " Возраст: " + age;
     }

    public static class Builder {
        private final String name;
        private final String surname;
        private int age;

        public Builder(String name, String surname) {
            this.name = name;
            this.surname = surname;
        }

        public Builder age(int age) {
            this.age = age;
            return this;
        }

        public Person build() {
            return new Person(this);
        }
    }
}
