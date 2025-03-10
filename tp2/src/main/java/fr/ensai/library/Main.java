package fr.ensai.library;
public class Main {

    public static void main(String[] args) {

        Author tolkien = new Author("J.R.R. Tolkien", 81, "UK");

        Book fellowshipOfTheRing = new Book(
                "978-0-618-26025-6",
                "The Fellowship of the Ring",
                tolkien,
                1954,
                423);

        System.out.println(fellowshipOfTheRing.toString());

        Library library=new Library("ENSAI BIB");
        library.loadBooksFromCSV("books.csv");
        Magazine magazine1 = new Magazine("1234-5678", "45", "Science Today", 2023, 120);
        Magazine magazine2 = new Magazine("9876-5432", "12", "Tech Innovations", 2024, 90);
        library.addItem(magazine1);
        library.addItem(magazine2);
        library.displayItems();
    }
}