package LibraryManagment;

public class Main {
    public static void main(String[] args) {
        Library library = new Library("Clean Code", "Robert C.Martin", "12345678");

        library.printInfo();
        library.borrowBook();
        library.returnBook();
        Library.libraryRules();
        library.bookType();

    }
}
