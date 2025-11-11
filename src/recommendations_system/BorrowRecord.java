package recommendations_system;

import java.time.LocalDate;

public class BorrowRecord {
    private Book book;
    private LocalDate borrawedDate;

    public Book getBook() {
        return book;
    }

    public void setBook(Book book) {
        this.book = book;
    }

    public LocalDate getBorrawedDate() {
        return borrawedDate;
    }

    public void setBorrawedDate(LocalDate borrawedDate) {
        this.borrawedDate = borrawedDate;
    }

    public BorrowRecord(Book book, LocalDate borrawedDate) {
        this.book = book;
        this.borrawedDate = borrawedDate;
    }

    @Override
    public String toString() {
        return "BorrowRecord{" +
                "book=" + book +
                ", borrawedDate=" + borrawedDate +
                '}';
    }

}
