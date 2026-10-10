package Week4.Book;

public class book {

    private String title;
    private String author;
    private boolean isBorrowed;


    public book(String title, String author){
        this.title = title;
        this.author = author;
        this.isBorrowed = false;
    }

    public String getTitle(){
        return title;
    } 
    public String getAuthor(){
        return author;
    }

    public void displayInfo(){
        String displayStatus;

        if (isBorrowed) {
            displayStatus = "Borrowed";
        }
        else{
            displayStatus = "Available";
        }
        System.out.println("Title of this book " + title);
        System.out.println("Author of this book " + author);
        System.out.println("Status of this book " + displayStatus);
    }

    public void borrowBook(){
        if (isBorrowed == true) {
            System.out.println("This book is already booked!!!");
        }
        else{ 
            isBorrowed = true;
            System.out.println("Book borrowed successfully!!!!");

        }
    }
    public void returnBook(){
        if (isBorrowed == true) {
            System.out.println("The book returned successfully!!!");
            isBorrowed = false;
        }
        else{
            System.out.println("The Book is not borrowed!!!");
        }
    }


    public static void main(String[] args) {
        book book1 = new book("Harry Potter", "J.K. Rowling");
        book book2 = new book("The Hobbit", "J.R.R. Tolkien");

        System.out.println(book1.getTitle());
        book1.borrowBook();
        book1.displayInfo();
    }
}


