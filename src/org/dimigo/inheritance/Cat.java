package org.dimigo.inheritance;

public class Cat extends Animal {

    public Cat(String name) {
        super(name);
    }

    @Override
    public void bark() {
        System.out.println("야옹");
    }

    public void scratch() {
        System.out.println("할퀸다.");
    }

}
