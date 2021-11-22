package ir.javaCup.services.menu;

import ir.javaCup.services.BookServices;
import ir.javaCup.services.BorrowServices;
import ir.javaCup.view.io.IoBook;
import ir.javaCup.view.io.IoBorrow;

public class BookMenuService {
    static BookServices bookServices = new BookServices();
    static IoBook ioBook = new IoBook();

    public static void bookMenu(int selectedMenu) {
        if (selectedMenu == 1) ioBook.create();
        if (selectedMenu == 2) IoBook.showBook(bookServices.searchByID(IoBook.getBookId()));
        if (selectedMenu == 3) bookServices.update(IoBook.getBookId());
        if (selectedMenu == 4) bookServices.delete(IoBook.getBookId());
        if (selectedMenu == 5) IoBook.showAllBook();
        if (selectedMenu == 6) BorrowServices.lendingBook();
        if (selectedMenu == 7) BorrowServices.returnBook();
        if (selectedMenu == 8) IoBorrow.showHistoyOfBorrow();
        if (selectedMenu == 9) IoBorrow.showUnreturnedBook();
        if (selectedMenu == 0) return;
    }
}
