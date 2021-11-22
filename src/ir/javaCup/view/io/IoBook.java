package ir.javaCup.view.io;

import ir.javaCup.model.Book;
import ir.javaCup.services.BookServices;

import java.util.Scanner;

public class IoBook implements IoInterface<Book>{
    public static Scanner input = new Scanner(System.in);
    static BookServices bookServices = new BookServices();

    public static void createUpdateCommon(Book book) {
        System.out.println("enter Book Name and author");
        book.setBookName(input.next());
        book.setAuthor(input.next());
        book.setBookExistence(true);
    }
    @Override
    public void create() {
        Book book = new Book();
        createUpdateCommon(book);
        System.out.println("Book ID is : " + bookServices.add(book));
    }

    public static int getBookId() {
        System.out.println("Press Book id");
        int id = input.nextInt();
        return id;
    }

    public static void showAllBook() {
        if (!BookServices.booksList.isEmpty()) {
            for (Book book : BookServices.booksList) {
                System.out.println(book);
            }
        } else {
            System.out.println("No books available\n");
        }
    }

    public static void showBook(Book book) {
        System.out.println(book);
    }

    public static void deleteMassage() {
        System.out.println("deleted");
    }

    public static void deleteMassageFailed() {
        System.out.println("No Book available\n");
    }

    public static void idNotFound() {
        System.out.println("you id wasn't found\n");
    }

}
