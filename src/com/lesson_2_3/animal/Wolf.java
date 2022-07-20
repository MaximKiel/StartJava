package com.lesson_2_3.animal;

public class Wolf {

    private String gender;
    private String name;
    private double weight;
    private int age;
    private String color;

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age > 8) {
            System.out.println("Некорректный возраст");
        } else {
            this.age = age;
        }
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void go() {
        System.out.println("Волк " + name + " идет");
    }

    public void sit() {
        System.out.println("Волк " + name + " сидит");
    }

    public void run() {
        System.out.println("Волк " + name + " бежит");
    }

    public void howl() {
        System.out.println("Волк " + name + " воет");
    }

    public void hunt() {
        System.out.println("Волк " + name + " охотится");
    }
}