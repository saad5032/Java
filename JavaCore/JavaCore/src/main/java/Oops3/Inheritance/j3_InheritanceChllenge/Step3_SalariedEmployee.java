package Oops3.Inheritance.j3_InheritanceChllenge;
// SalariedEmployee - child of Employee class - grandchild of Worker Class.
public class Step3_SalariedEmployee extends Step2_Employee{
    private double annualSalary;
    private boolean isRetired;

    // Constructor
    Step3_SalariedEmployee(String name,String birthDate,
    String hireDate, double annualSalary){

        super(name, birthDate, hireDate); // Calls Employee args constructor
        this.annualSalary = annualSalary;
    }

    // Methods:
    @Override
    public double collectPay() {
        double salary = this.annualSalary / 26;
        double pensionPay = 0.9 * salary; // as per company calculation
        double PayCheck = (isRetired) ? pensionPay : salary;  // if retired give pension pay or else salary
        return (int) PayCheck;  // type casting Paycheck as it removes decimals (cents).
    /*
    - This employee gets paid biweekly, so every 2 weeks, for a total of 26 pay periods per year.
    - The result of (int) this.annualSalary / 26 is an int, but afterwards Java performs an automatic/implicit 
    conversion to double because the method return type is double.
    - Primitive type hierarchy: byte -> short -> int -> long -> float -> double.
    - Java can implicitly convert int (and other smaller types) to double, so you can return int or other types in double return method.
    */
    }

    public void retire(){
        // we call this method when employee is retired.
        terminate("12/12/2025"); // Date provided by company and terminate() is the method of base class Worker.
        isRetired = true;
    }

    // toString
    @Override
    public String toString() {
        return "SalariedEmployee { annualSalary : " + annualSalary + ", isRetired : " + isRetired + "} and " + super.toString();
    }

}
