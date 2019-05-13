package kr.taevel.oop2;

public class CarTest {

    public static void main(String[] args) {
        Car.setCompany("현대");
        Car[] cars = {
                new Car("아반떼"),
                new Car("투싼"),
                new Car("싼타")
        };
        Car.setCompany("현대");

        for (Car car: cars) {
            System.out.println(car);
        }
    }

}
