package library_Managment;

import java.util.ArrayList;
import java.util.List;

public class Library<T extends Library.Section> {

    private List<T> sections;

    public Library() {
        this.sections = new ArrayList<>();
    }

    public void filterBooks(BookFilter filter) {
        sections.forEach(section -> section.books.stream().filter(filter::filter).forEach(System.out::println));
    }

    public void addSection(T section) {
        sections.add(section);
    }


    class Book {
        private String title;
        private String author;
        private int year;

        public Book(String title, String author, int year) {
            this.title = title;
            this.author = author;
            this.year = year;
        }

        public String getTitle() {
            return title;
        }

        public void setTitle(String title) {
            this.title = title;
        }

        public String getAuthor() {
            return author;
        }

        public void setAuthor(String author) {
            this.author = author;
        }

        public int getYear() {
            return year;
        }

        public void setYear(int year) {
            this.year = year;
        }

        @Override
        public String toString() {
            return "Book{" +
                    "title='" + title + '\'' +
                    ", author='" + author + '\'' +
                    ", year=" + year +
                    '}';
        }


    }

    static class Section {
        private String name;
        List<Library<?>.Book> books;

        public Section(String name) {
            this.name = name;
            this.books = new ArrayList<>();
        }

        public void addBook(Library<?>.Book book) {

            this.books.add(book);
        }

        public void displayBooks() {
            if (books.isEmpty()) {
                System.out.println("kitab yoxdur");
            } else {
                System.out.println("kitab" + name + ":");
            }
            for (Library<?>.Book bookList : books) {
                System.out.println(bookList);
            }
        }

    }
}
