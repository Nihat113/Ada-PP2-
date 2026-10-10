package Week4.Book;

public class Library {
    private book[] books;
    private int bookCount;

    public Library(int capacity) {
        books = new book[capacity];
        bookCount = 0;
    }

    public void addBook(book book) {

        if (bookCount >= books.length) {
            System.out.println("Library is full!");
        } 
        else {
            books[bookCount] = book;
            bookCount++;
            System.out.println("Book added successfully!");
        }
    }

    public void searchBook(String title) {

        for (int i = 0; i < bookCount; i++) {

            if (books[i].getTitle().equals(title)) {
                books[i].displayInfo();
                return;
            }
        }

        System.out.println("Book not found!");
    }


    public static void main(String[] args) {
        Library library = new Library(5);

        book book1 = new book("Harry Potter", "J.K. Rowling");
        book book2 = new book("The Hobbit", "J.R.R. Tolkien");

        library.addBook(book1);
        library.addBook(book2);

        library.searchBook("The Hobbit");
        library.searchBook("Titanic");
    }


}


