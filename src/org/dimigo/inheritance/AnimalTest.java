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
    }

}
