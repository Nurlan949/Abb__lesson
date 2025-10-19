package LibraryManagment;

public class main {
    public static void main(String[] args) {
        library library = new library("Clean Code", "Robert C.Martin", "12345678");
        library library2 = new library("Clean ", "Martin", "1115151");
        library.printInfo();
        library.borrowBook();
        library.returnBook();
        library.libraryRules();
        library.bookType();
        System.out.println("-----------------------------");
        System.out.println("-----------------------------");
        library2.printInfo();
        library2.borrowBook();
        library2.returnBook();
        library2.libraryRules();
        library2.bookType();
    }
}
