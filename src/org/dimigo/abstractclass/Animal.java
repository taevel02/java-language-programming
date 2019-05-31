package org.dimigo.abstractclass;

public abstract class Animal {

    public void eat() {
        System.out.println("냠냠");
    }

    // 반드시 오버라이딩하라고 강제화
    public abstract void bark();

}
