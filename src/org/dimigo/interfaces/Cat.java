package org.dimigo.interfaces;

public class Cat implements IAnimal {
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
        System.out.println("냐옹");
    }
}
