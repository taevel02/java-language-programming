package org.dimigo.inheritance;

public class AnimalTest {

    public static void main(String[] args) {
        Animal a = new Animal("아무개");
        System.out.println(a);
        a.eat();
        a.sleep();
        a.bark();

        Dog d = new Dog("강아지");
        System.out.println(d);
        d.eat();
        d.sleep();
        d.bark();
        d.wag();

        Cat c = new Cat("고양이");
        System.out.println(c);
        c.eat();
        c.sleep();
        c.bark();
        c.scratch();

        Tiger t = new Tiger("호랑이");
        System.out.println(t);
        t.eat();
        t.sleep();
        t.bark();
        t.hunt();

        Animal d2 = new Dog("멍멍이");
        Animal c2 = new Cat("냥냥이");
        Animal t2 = new Tiger("어흥이");
        d2.bark();
        c2.bark();
        t2.bark();

        Animal[] animals = {
                new Dog("멍멍"),
                new Cat("야옹"),
                new Tiger("어흥")
        };

        for (Animal animal : animals) {
            System.out.println(animal);
            animal.eat();
            animal.sleep();
            animal.bark();
        }

        for (Animal animal : animals) {
            doBark(animal);
        }
    }

    private static void doBark(Animal animal) {
        System.out.println(animal);
        animal.eat();
        animal.sleep();
        animal.bark();
    }

}
