package LibraryManagment;

public class main {
    public static void main(String[] args) {
        library library = new library("Clean Code", "Robert C.Martin", "12345678");
        library.printInfo();
        library.borrowBook();
        library.returnBook();
        library.libraryRools();
        library.bookType();


    }
}
