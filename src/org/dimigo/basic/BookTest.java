package org.dimigo.basic;

import org.dimigo.oop.Book;

public class BookTest {

    public static void main(String[] args) {
        Book book = new Book("수학의 정석", "홍성대", 250);

        System.out.println(book.getTitle());
        System.out.println(book.getAuthor());
        System.out.println(book.getPage());
    }

}
