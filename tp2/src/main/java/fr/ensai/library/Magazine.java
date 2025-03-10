package fr.ensai.library;
public class Magazine extends Item {
    private String issn;
    private String issueNumber;
    private String title;
    private int year;
    private int pageCount;

    public Magazine(String issn, String issueNumber, String title, int year, int pageCount){
        super(title,year,pageCount);
        this.issn=issn;
        this.issueNumber=issueNumber;
    }

    @Override
    public String toString() {
        return "Magazine " + title + " number " + issueNumber;
    }
}
