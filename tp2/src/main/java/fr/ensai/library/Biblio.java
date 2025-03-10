package fr.ensai.library;
import java.util.ArrayList;
import java.util.List;

public class Biblio {
    private String name ;
    private List<Book> livres = new ArrayList<>();

    public Biblio(String name, List<Book> livres){
        this.name=name;
        this.livres=livres;
    }


    public String getName(){
        return this.name;
    }

    public  List<Book> getLivres(){
        return this.livres;
    }

    public void addBook(Book book){
        this.livres.add(book);
    }

    public void displayBooks(){
        if (this.livres!=null){
            for(Book book : this.livres){
                System.out.println(book.toString());
            }
        } else System.out.println("Aucun livre dans la bibliothèque");
    }
}
