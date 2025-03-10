package fr.ensai.library;
public class Student extends Person {
    private int academicYear;
    private boolean isClassDelegate;
    private String name;
    private int age;
    
    public Student(int academicYear, boolean isClassDelegate, String name, int age){
        super(name,age);
        this.academicYear=academicYear;
        this.isClassDelegate=isClassDelegate;
    }
}
