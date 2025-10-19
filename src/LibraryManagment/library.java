package LibraryManagment;

public class library {
    private String title;
    private String author;
    private String isbn;
    protected int totalCopies;
    protected int availableCopies;

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

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public int getTotalCopies() {
        return totalCopies;
    }

    public void setTotalCopies(int totalCopies) {
        this.totalCopies = totalCopies;
    }

    public int getAvailableCopies() {
        return availableCopies;
    }

    public void setAvailableCopies(int availableCopies) {
        this.availableCopies = availableCopies;
    }

    public library(String title, String author, String isbn, int totalCopies, int availableCopies) {
        this.title = title;
        this.author = author;
        this.isbn = isbn;
        this.totalCopies = 1;
        this.availableCopies = 1;
    }

    {
        System.out.println("New book created!");
    }

    public void borrowBook() {
        if (availableCopies > 0) {
            availableCopies--;
            System.out.println("book borrow successfully!");
        } else {
            System.out.println("Sorry,no copies available");
        }
    }

    public void returnBook() {
        if (availableCopies < totalCopies) {
            availableCopies++;
            System.out.println("Book return successfully!");
        } else {
            System.out.println("All copies are already in the library.");
        }
    }

    public void printInfo() {
        System.out.println("Book info:");
        System.out.println("title" + ":" + title);
        System.out.println("Author" + ":" + author);
        System.out.println("Isbn" + ":" + isbn);
        System.out.println("Total copies" + ":" + totalCopies);
        System.out.println("Available copies" + ":" + availableCopies);
    }

    public static void libraryRools() {
        System.out.println("Max 3 books can be borrowed per person.");
    }

    public final void bookType() {
        System.out.println("This is a regular book.");

    }
}
