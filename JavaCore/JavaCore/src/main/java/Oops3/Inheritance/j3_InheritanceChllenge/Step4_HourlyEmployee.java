package Oops3.Inheritance.j3_InheritanceChllenge;
// Hourly Emplyee - child of Employee class - grandchild of Worker Class.
public class Step4_HourlyEmployee extends Step2_Employee{
    private double hourlyPayRate;

    // Constructor
    public Step4_HourlyEmployee(String name,String birthDate,
    String hireDate, double hourlyPayRate){  // calls Employee args constructor.
        super(name, birthDate, hireDate);
        this.hourlyPayRate = hourlyPayRate;
    }

    // Methods :
    @Override
    public double collectPay() {
        return 40 * hourlyPayRate;  // Get paid weekly, there are 40 working hrs in a week.
    }
    public double getDoublePay(){
        return 2 * collectPay();
    }

    // toString
    @Override
    public String toString() {
        return "HourlyEmployee { hourlyPayRate : " + hourlyPayRate + "} and " + super.toString();
    }
}
