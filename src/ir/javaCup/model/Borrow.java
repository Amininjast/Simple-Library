package ir.javaCup.model;

import java.util.Date;

public class Borrow {
    private int bookId;
    private int memberId;
    private Date returnDate;
    private Date borrowedDate;
    private Date expectedReturnDate;
    private int borrowId;

    public Date getExpectedReturnDate() {
        return expectedReturnDate;
    }

    public void setExpectedReturnDate(Date expectedReturnDate) {
        this.expectedReturnDate = expectedReturnDate;
    }

    public int getBorrowId() {
        return borrowId;
    }

    public void setBorrowId(int borrowId) {
        this.borrowId = borrowId;
    }

    public int getBookId() {
        return bookId;
    }

    public void setBookId(int bookId) {
        this.bookId = bookId;
    }

    public int getMemberId() {
        return memberId;
    }

    public void setMemberId(int memberId) {
        this.memberId = memberId;
    }

    public Date getReturnDate() {
        return returnDate;
    }

    public void setReturnDate(Date returnDate) {
        this.returnDate = returnDate;
    }

    public Date getBorrowedDate() {
        return borrowedDate;
    }

    public void setBorrowedDate(Date borrowedDate) {
        this.borrowedDate = borrowedDate;
    }

    @Override
    public String toString() {
        return "Borrow{" +
                "bookId=" + bookId +
                ", memberId=" + memberId +
                ", returnDate=" + returnDate +
                ", borrowedDate=" + borrowedDate +
                ", expectedReturnDate=" + expectedReturnDate +
                ", borrowId=" + borrowId +
                '}';
    }
}
