package org.dimigo.interfaces;

public class Dog implements IAnimal {
    @Override
    public void eat() {
        System.out.println("냠냠");
    }

    @Override
    public void sleep() {
        System.out.println("꿀꿀");
    }

    @Override
    public void bark() {
        System.out.println("멍멍");
    }

    public void wag() {
        System.out.println("꼬리를 흔든다");
    }
}
