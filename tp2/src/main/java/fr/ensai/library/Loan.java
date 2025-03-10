package fr.ensai.library;
import java.util.Date;

public class Loan {
    private Item item;
    private Student borrower;
    private Date startDate;
    private Date returnDate;

    public Loan(Item item, Student borrower, Date startDate, Date returnDate){
        this.item=item;
        this.borrower=borrower;
        this.startDate=startDate;
        this.returnDate=returnDate;
    }

    public Item getItem(){
        return this.item;
    }

    public Student getBorrower(){
        return this.borrower;
    }

    public Date getStartDate(){
        return this.startDate;
    }

    public Date getReturnDate(){
        return this.returnDate;
    }
}
