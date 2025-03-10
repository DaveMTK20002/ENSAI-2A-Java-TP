package fr.ensai.library;
/**
 * Represents a book.
 */
public class Book extends Item {

    // Attributes
    private String isbn;
    private String title;
    private Author author;
    private int year;
    private int pageCount;
    public Book(String isbn, String title, Author author, int year, int pageCount){
            super(title,year,pageCount);
            this.isbn = isbn;
            this.author = author;
        }

    public Author getAuthor() {
        return author;
    }

    @Override
    public String toString() {
        return "Book " + getTitle() + " written by " + author.toString();
    }

}
