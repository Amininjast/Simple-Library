package ir.javaCup.services;

import ir.javaCup.model.Book;
import ir.javaCup.view.io.IoBook;
import ir.javaCup.view.io.IoMember;

import java.util.ArrayList;

public class BookServices implements Services<Book> {

    public static ArrayList<Book> booksList = new ArrayList();
    static int bookCounter = 1;

    @Override
    public int add(Book book) {
        int id = bookCounter;
        book.setBookId(id);
        booksList.add(book);
        IoBook.showAllBook();
        bookCounter++;
        return id;
    }

    public static Book searchByID(int id) {
        Book book2 = null;
        for (Book book : booksList) {
            if (book.getBookId() == id) {
                book2 = book;
                break;
            }
        }
        return book2;
    }

    @Override
    public void update(int id) {
        if (!booksList.isEmpty()) {
            for (Book book : booksList) {
                if (book.getBookId() == id) {
                    IoBook.createUpdateCommon(book);
                    break;
                } else {
                    IoBook.idNotFound();
                }
            }
        } else {
            IoMember.deleteMassageFailed();
        }
    }

    @Override
    public void delete(int id) {
        if (!booksList.isEmpty()) {
            for (Book book : booksList) {
                if (book.getBookId() == id) {
                    IoBook.deleteMassage();
                    booksList.remove(book);
                    break;
                }
            }
        } else {
            IoBook.deleteMassageFailed();
        }
    }

}
