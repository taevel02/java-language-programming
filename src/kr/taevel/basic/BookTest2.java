package kr.taevel.basic;

import kr.taevel.oop.Book;

public class BookTest2 {

    private static void compare() {
        int a = 10;
        int b = a;

        System.out.println(a == b ? "true" : "false");

        Book book = new Book();
        Book book2 = book;

        System.out.println(book == book2 ? "true" : "false");

        book2.setTitle("쎈 수학");
        System.out.println(book2.getTitle());
        System.out.println(book.getTitle());
    }

    public static void main(String[] args) {
        compare();
        System.out.println("---------------------------");

        int num = 5;
        methodA(num);
        System.out.println(num);

        System.out.println("---------------------------");

        Book book = new Book("수학의 바이블");
        methodB(book);

        System.out.println("---------------------------");

        methodC(book);
        System.out.println(book.getTitle());

        System.out.println("---------------------------");

        Book book2 = null;
        System.out.println(book2.getTitle());
    }

    private static void methodA(int num) {
        num++;
        System.out.println(num);
    }

    private static void methodB(Book book) {
        System.out.println(book.getTitle());
        book = new Book("이것이 자바다");
        System.out.println(book.getTitle());
    }

    private static void methodC(Book book) {
        book.setTitle("자바의 정석");
        System.out.println(book.getTitle());
    }

}
