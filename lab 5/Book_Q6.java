import java.util.Scanner;
class Book{
    String name;
    String author;
    String edition;
    Book(){
        name = null;
        author = null;
        edition = null;
    }
    Book(String name, String author, String edition){
        this.name = name;
        this.author = author;
        this.edition = edition;
    }
    void displayByAuthorName(String author){
        if(this.author == author){
            System.out.println("Name: " + name + "Author: "+ author+ "Edition: "+edition);
        }
    }
    void display(){
            System.out.println("Name: " + name + "Author: "+ author+ "Edition: "+edition);
    
    }
}
public class Book_Q6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Book[] books = new Book[6];
        // books = fill(books);
        books[0] = new Book("Java Basics", "John Doe", "First Edition");
        books[1]= new Book("Advanced Java", "John Doe", "Second Edition");
        books[2]= new Book("Java Programming", "John Doe", "First Edition");
        books[3]= new Book("Data Structures", "Jane Smith", "Third Edition");
        books[4]= new Book("Algorithms", "Alan Turing", "Second Edition");
        books[5]= new Book("Computer Networks", "Tom Brown", "First Edition");
        books = arrangeInAscending(books);
        System.out.println("Book arranged in ascending based on author name: ");
        displayBooks(books);
        System.out.println("Enter an author name: ");
        String author = sc.nextLine();
        System.out.println("Book by"+ author +":  ");
        displayBooksByAuthor(author,books);
        sc.close();
    }
    static void displayBooksByAuthor(String author,Book[] books){
        for (Book book : books) {
            book.displayByAuthorName(author);
        }
    }
    static void displayBooks(Book[] books){
        for (Book book : books) {
            book.display();
        }
    }
    static Book[] arrangeInAscending(Book[] books){
        for (int i = 0; i < books.length -1; i++) {
            for (int j = 0; j < books.length -1-i; j++) {
                if(books[j].name.compareTo(books[j+1].name) >0){  //.compareTo is like strCmp and returns an int
                    Book temp = books[j];
                    books[j] = books[j+1];
                    books[j+1] = temp;
                }
            }
        }
        return books;
    }
}
