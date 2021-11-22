package ir.javaCup.services;

import java.util.Date;

import ir.javaCup.model.Book;
import ir.javaCup.model.Borrow;
import ir.javaCup.model.Member;
import ir.javaCup.view.io.IoBook;
import ir.javaCup.view.io.IoBorrow;
import ir.javaCup.view.io.IoMember;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.ZoneId;
import java.util.ArrayList;
import java.util.Scanner;

public class BorrowServices {
    public static Scanner input = new Scanner(System.in);
    static int borrowCounter = 1;

    public static ArrayList<Borrow> borrowList = new ArrayList();

    public static void lendingBook() {
        Borrow borrow = new Borrow();
        Book book = BookServices.searchByID(IoBook.getBookId());
        borrow.setBookId(book.getBookId());
        Member member = MemberServices.searchByID(IoMember.getMemberId());
        borrow.setMemberId(member.getMemberId());
        IoBorrow.dateFormate();
        try {
            borrow.setExpectedReturnDate(new SimpleDateFormat("dd/MM/yyyy").parse(input.next()));
            borrow.setBorrowedDate(new Date());
            book.setBookExistence(false);
            borrow.setBorrowId(borrowCounter);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        borrowList.add(borrow);
        borrowCounter++;
        IoBorrow.showHistoyOfBorrow();
    }

    public static void returnBook() {
        int id = IoBook.getBookId();
        LocalDate dateNow = LocalDate.now();
        LocalDate date;
        for (Borrow borrow : borrowList) {
            if (borrow.getBookId() == id) {
                date = borrow.getExpectedReturnDate().toInstant()
                        .atZone(ZoneId.systemDefault())
                        .toLocalDate();
                if (dateNow.isAfter(date)) {
                    IoBorrow.showFalseBorrowValidator();
                    Book book = BookServices.searchByID(id);
                    borrow.setReturnDate(new Date());
                    book.setBookExistence(true);
                }
                if (!dateNow.isAfter(date)) {
                    IoBorrow.showTrueBorrowValidator();
                    Book book = BookServices.searchByID(id);
                    borrow.setReturnDate(new Date());
                    book.setBookExistence(true);
                }
            }
        }

    }


}