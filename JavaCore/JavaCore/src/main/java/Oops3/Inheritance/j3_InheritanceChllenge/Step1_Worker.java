package Oops3.Inheritance.j3_InheritanceChllenge;
// Create Worker Class - Base class or super class - Parent.
public class Step1_Worker {
    // fields
    private String name;
    private String birthDate;
    private String endDate;

    // Default constructor to make object and sets default values for above fields for this class object 
    // and for giving more flexbility to our sub classes.
    public Step1_Worker(){

    }

    // Args Constructor to make object and set above fields for this class object:
    public Step1_Worker(String name,String birthDate){
        this.name = name;
        this.birthDate = birthDate;
    }

    // Methods :
    public int getAge(){
        int PresentYear = 2025;
        int age = PresentYear - Integer.parseInt(this.birthDate.substring(6)); 
        // subString extracts a part of the birthDate string starting from the 6th index to the end of the string.
        // if birthDate is "01/01/2000", substring(6) would return "2000".
        return age;
    }

    public double collectPay(){
        return 0.0;
    }

    public void terminate(String endDate){
        this.endDate = endDate;
        System.out.println("The worker is terminated on date : "+ this.endDate);
    }

    // toString to print all the fields for every other object you make of this class
    @Override
    public String toString() {
        return "Worker { name : " + name + ", birthDate : " + birthDate + ", endDate : " + endDate + " } ";
    }

   



}
