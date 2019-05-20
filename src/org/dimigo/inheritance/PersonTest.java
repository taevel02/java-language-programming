package org.dimigo.inheritance;

public class PersonTest {

    public static void main(String[] args) {
        Person p = new Person("아이유", 26, 162, 48);
        System.out.println(p);
        p.eat();
        p.sleep();

        Student s = new Student("권태훈", 18, 176, 67, "2502");
        System.out.println(s);
        s.eat();
        s.sleep();
        s.rollCall();
        s.studyAtNight();

        Teacher t = new Teacher("박성수", 50, 180, 80, "정보통신");
        System.out.println(t);
        t.eat();
        t.sleep();
        t.teach();
        t.doTask();
    }

}
