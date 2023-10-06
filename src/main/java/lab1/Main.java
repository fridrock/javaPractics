package lab1;

import lab1.Book;

public class Main {
    public static void main(String[] args) {
        Book book = new Book(
                        "50 shades of grey",
                        "Mishel",
                        2018,
                        100);
        book.hoursToRead();
        System.out.println(book.getYearOfRelease());
        System.out.println(book);
        book = new Book(
                "Financist",
                "Teodor Draiser",
                1912,
                700);
        System.out.println(book.getAuthor());
        System.out.println(book);
        book.hoursToRead();

    }
}
