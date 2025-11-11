package recommendations_system;

import java.time.LocalDate;
import java.util.List;
import java.util.Optional;
import java.util.*;
import java.util.stream.Collectors;


public class LibraryService {
    List<User> users;
    List<Book> books;

    public LibraryService(List<User> users, List<Book> books) {
        this.users = users;
        this.books = books;
    }

    public double getAvarageRating() {
        return books.stream().mapToDouble(Book::getRaiting).average().orElse(0.0);
    }

    public List<Book> getAvailableAnd2000() {
        return books.stream().filter(book -> book.getYear() > 2000 && book.isAvailable()).collect(Collectors.toList());
    }

    public Optional<String> getMostBorrowBook() {
        return users.stream()
                .flatMap(u -> u.getBorrowHistory().stream())
                .map(record -> record.getBook())
                .collect(Collectors.groupingBy(Book::getTitle, Collectors.counting()))
                .entrySet()
                .stream()
                .max(Map.Entry.comparingByValue())
                .map(Map.Entry::getKey);
    }

    public Map<String, List<Book>> getCurrentlyReading() {
        return users.stream().collect(Collectors.toMap(User::getName, u -> u.getBorrowHistory().stream().filter(r -> r.getBorrawedDate() == null).map(BorrowRecord::getBook).collect(Collectors.toList())));
    }

    public Map<String, List<Book>> getAuthorWithBooks1950() {
        return books.stream().filter(b -> b.getYear() > 1950).collect(Collectors.groupingBy(Book::getAuthor));
    }

    public Optional<Book> findRecommendedBookForUser(User user) {
        if (user.getBorrowHistory().isEmpty()) {
            return Optional.empty();
        }
        Optional<String> mostReadAuthor = user.getBorrowHistory().stream().collect(Collectors.groupingBy(d -> d.getBook().getAuthor(), Collectors.counting())).entrySet().stream().max(Map.Entry.comparingByValue()).map(Map.Entry::getKey);
        if (mostReadAuthor.isEmpty()) {
            return Optional.empty();
        }
        String author = mostReadAuthor.get();
        return books.stream().filter(b -> b.getAuthor().equals(author))
                .filter(b -> b.isAvailable())
                .max(Comparator.comparing(Book::getRaiting));
    }

    public Set<String> uniqueisAuthor() {
        return users.stream().flatMap(user -> user.getBorrowHistory().stream()).map(r -> r.getBook().getAuthor()).collect(Collectors.toSet());
    }

    public Optional<User> readerOfMouth(int month, int year) {
        return users.stream().filter(user -> !user.getBorrowHistory().isEmpty())
                .max(Comparator.comparingLong(user ->
                        user.getBorrowHistory().stream()
                                .filter(r -> r.getBorrawedDate().getYear() == year
                                        && r.getBorrawedDate().getMonthValue() == month)
                                .count()
                ));
    }
}
