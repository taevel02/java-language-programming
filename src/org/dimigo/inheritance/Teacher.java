package org.dimigo.inheritance;

public class Teacher extends Person {

    private String subject;

    public Teacher(String name, int age, int height, int weight, String subject) {
        super(name, age, height, weight);
        this.subject = subject;
    }

    public void teach() {
        System.out.println(getName() + "쌤이 가르친다.");
    }

    public void doTask() {
        System.out.println(getName() + "쌤이 일을 한다.");
    }

    @Override
    public String toString() {
        return "Teacher{" +
                "subject='" + subject + '\'' +
                super.toString();
    }
}
