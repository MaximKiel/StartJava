package com.lesson_2_3_4.person;

public class Person {
    
    String gender = "мужской";
    String name = "Макс";
    int height = 187;
    double weight = 80.5;
    int age = 24;

    void walk() {
        System.out.println(name + " идет");
    }

    void sit() {
        System.out.println(name + " сидит");
    }

    void run() {
        System.out.println(name + " бежит");
    }

    void speak() {
        System.out.println(name + " говорит");
    }

    void learnJava() {
        System.out.println(name + " изучает Java");
    }
}