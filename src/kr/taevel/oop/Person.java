package kr.taevel.oop;

public class Person {

    private final String type = "권태훈";
    private final String birthDate;
    private String name;

    public Person(String birthDate, String name) {
        this.birthDate = birthDate;
        this.name = name;
    }

    @Override
    public String toString() {
        return "Person{" +
                "type='" + type + '\'' +
                ", birthDate='" + birthDate + '\'' +
                ", name='" + name + '\'' +
                '}';
    }
}
