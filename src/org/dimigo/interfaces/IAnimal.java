package org.dimigo.interfaces;

public interface IAnimal {
    // 상수 (public static final)
    String FARM_NAME = "동물농장";

    // abstract method (public abstract)
//    void eat();
//    void sleep();
    void bark();

    // default method (public) from JDK8
    default void eat() {
        System.out.println("냠냠");
    }

    default void sleep() {
        System.out.println("쿨쿨");
    }

    // static method
    static void welcome() {
        System.out.println(FARM_NAME + "에 오신걸 환영합니다.");
    }
}
