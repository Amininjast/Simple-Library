package ir.javaCup.view.io;

import ir.javaCup.services.BorrowServices;
import ir.javaCup.model.Borrow;

public class IoBorrow {
    public static void showHistoyOfBorrow() {
        for (Borrow borrow : BorrowServices.borrowList) {
            System.out.println(borrow);
            System.out.println();
        }
    }

    public static void showUnreturnedBook() {
        for (Borrow borrow : BorrowServices.borrowList) {
            if (borrow.getReturnDate() == null) {
                System.out.println(borrow);
            }
        }
    }
    public static void dateFormate(){
        System.out.println("enter return date with the formate dd/MM/yyyy");
    }
    public static void showFalseBorrowValidator(){
        System.out.println("You should have returned the book sooner");
    }
    public static void showTrueBorrowValidator(){
        System.out.println("thanks for returning the book");
    }

}
