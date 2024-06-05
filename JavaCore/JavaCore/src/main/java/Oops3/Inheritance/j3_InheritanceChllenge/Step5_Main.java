package Oops3.Inheritance.j3_InheritanceChllenge;
// This main class executes Employee class objects. 
public class Step5_Main {
    public static void main(String[] args) {
        // Employee Object
        System.out.println("\nEmployee Object : ");
        Step2_Employee E = new Step2_Employee("Syed", "01/03/1992","10/11/2020");
        System.out.println(E);
        // Executing Worker parent class methods via its child Employee.
        System.out.println("Pay of Employee - Syed : "+E.collectPay());
        System.out.println("Age : "+E.getAge());
        E.terminate("05/09/2024");
        System.out.println("\n");

        // Salaried Employee Object
        System.out.println("Salaried Employee Object : ");
        Step3_SalariedEmployee SE = new Step3_SalariedEmployee("Fahad", "01/03/1960", "10/11/2020", 80000.764D); // D for Double
        System.out.println(SE);
        System.out.println("Biweekly salary paycheck before retirement of Salaried Employee - Fahad : " + SE.collectPay()); 
        SE.retire(); // retired.
        System.out.println("Biweekly pension paycheck after retirement of Salaried Employee - Fahad : " + SE.collectPay()); 
        System.out.println("Age : "+SE.getAge());
        System.out.println("\n");  

        // Hourly Employee Object
        System.out.println("Hourly Employee Object : ");
        Step4_HourlyEmployee HE = new Step4_HourlyEmployee("Sohail", "01/03/1985", "10/11/2020", 15);
        System.out.println(HE);
        System.out.println("Week Pay of 40hrs for 15$ per hr : "+HE.collectPay());
        System.out.println("Double pay : "+HE.getDoublePay());
        System.out.println("Age : "+HE.getAge());
        HE.terminate("05/09/2024");
        System.out.println("\n");    
    }
}
