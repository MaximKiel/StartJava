package com.lesson_2_3_4.animal;

public class WolfTest {

    public static void main (String[] args){
        Wolf wolfAron = new Wolf();
        wolfAron.setGender("самец");
        wolfAron.setName("Арон");
        wolfAron.setWeight(40.5);
        wolfAron.setAge(7);
        wolfAron.setColor("серый");

        System.out.println("Пол волка: " + wolfAron.getGender());
        System.out.println("Имя волка: " + wolfAron.getName());
        System.out.println("Вес волка: " + wolfAron.getWeight() + " кг");
        System.out.println("Возраст волка: " + wolfAron.getAge() + " лет");
        System.out.println("Окрас волка: " + wolfAron.getColor());

        wolfAron.go();
        wolfAron.sit();
        wolfAron.run();
        wolfAron.howl();
        wolfAron.hunt();
    }
}