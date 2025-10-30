package libraryManagement;

public class Main {
    public static void main(String[] args) {
        Library<Library.Section> library = new Library<>();
        Library.Section fictionSection = new Library.Section("Fiction");
        Library.Section historySection = new Library.Section("History");
        Library<Library.Section>.Book book1 = library.new Book("1984", "Nurlan Aiyev", 1949);
        Library<Library.Section>.Book book2 = library.new Book("Happiness", "Rasul Kerimov", 1960);
        Library<Library.Section>.Book book3 = library.new Book("The Martian", "Andy Weir", 2011);
        fictionSection.addBook(book1);
        fictionSection.addBook(book2);
        historySection.addBook(book3);
        library.addSection(fictionSection);
        library.addSection(historySection);
        fictionSection.displayBooks();
        historySection.displayBooks();
        library.filterBooks(book -> book.getYear() > 2015);
    }
}
