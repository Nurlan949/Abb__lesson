package recommendations_system;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Book book1 = new Book("Java Programming", "James Gosling", 1999, 4.5, true);
        Book book2 = new Book("Effective Java", "Joshua Bloch", 2008, 4.8, true);
        Book book3 = new Book("Clean Code", "Robert C. Martin", 2005, 4.7, false);
        Book book4 = new Book("Spring in Action", "Craig Walls", 2020, 4.6, true);
        Book book5 = new Book("Head First Java", "Kathy Sierra", 2003, 4.3, true);
        List<Book> books = Arrays.asList(book1, book2, book3, book4, book5);
        BorrowRecord r1 = new BorrowRecord(book2, LocalDate.of(2025, 10, 2));
        BorrowRecord r2 = new BorrowRecord(book3, LocalDate.of(2025, 10, 15));
        BorrowRecord r3 = new BorrowRecord(book2, LocalDate.of(2025, 11, 5));
        BorrowRecord r4 = new BorrowRecord(book5, LocalDate.of(2025, 11, 2));
        User user1 = new User("Nurlan", 18, Arrays.asList(r1, r2));
        User user2 = new User("Aysel", 20, Arrays.asList(r3, r4));
        User user3 = new User("Rashad", 30, new ArrayList<>());
        List<User> users = Arrays.asList(user1, user2, user3);
        LibraryService service = new LibraryService(users, books);
        System.out.println(service.getAvarageRating());
        service.getAvailableAnd2000().forEach(b -> System.out.println(b.getTitle()));
        System.out.println(service.getMostBorrowBook().orElse("tapilmadi"));
        service.getCurrentlyReading().forEach((user, list) -> System.out.println(user + "-" + list.stream().map(Book::getTitle)));
        service.getAuthorWithBooks1950().forEach((author, list) -> System.out.println(author + "-" + list.stream().map(Book::getTitle)));
        service.findRecommendedBookForUser(user1).map(Book::getTitle).orElse("tovsiyye yoxdur");
        System.out.println(service.uniqueisAuthor());
        service.readerOfMouth(11, 2022).map(User::getName).orElse("Ad tapilmadi");

    }
}
