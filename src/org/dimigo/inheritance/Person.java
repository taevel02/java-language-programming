package org.dimigo.inheritance;

public class Person {

    private String name;
    private int age;
    private int height;
    private int weight;

    public Person() { }

    public Person(String name, int age, int height, int weight) {
        this.name = name;
        this.age = age;
        this.height = height;
        this.weight = weight;
    }

    public String getName() {
        return name;
    }

    public void eat() {
        System.out.println(name + "이/가 밥을 먹는다.");
    }

    public void sleep() {
        System.out.println(name + "이/가 잠을 잔다.");
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", height=" + height +
                ", weight=" + weight +
                '}';
    }
}
