package Oops1;

public class j3_Constructors {
    /* Things you will learn in Oops1 - j3
    - Constructors : With the help of constructor we can make objects as they initialize the fields for example the default constructor
      initialize the variables (primitives/non-primitives) to their default values.
    - Instance variables/fields : used so that objects can have different values 
    */
    private long accountNumber;
    private double balance;
    private String name;
    private String email;
    private int phoneNumber;

    public void deposit(double depositAmount) {
        this.balance += depositAmount;
    }

    public void withdraw(double withdrawAmount) {
        if ((this.balance - withdrawAmount) < 0) {
            System.out.println("Insufficient funds");
        } else {
            this.balance -= withdrawAmount;
            System.out.println("The amont withdrawn is " + withdrawAmount
                    + "$ and remaining balance is " + this.balance + "$");
        }

    }

    /*
     * - lets make a constructor, now you dont need to use setter all the time to
     * pass data.
     * - The constructor (j3_bankAccount_Constructor) is also used to create
     * objects, but as
     * it is special method
     * - you have to pass parameters. In this way you kill 2 birds with one stone,
     * make object also pass or set data for this object.
     * - Then later you can change it the way you want using setters when necessary.
     */
    public j3_Constructors(long accountNumber, double balance, String name, String email, int phoneNumber) {
        // Here this keyword is able to distinguish between the parameters passed and the variable names of this class.
        this.accountNumber = accountNumber;
        this.balance = balance;
        this.email = email;
        this.name = name;
        this.phoneNumber = phoneNumber;
    }

    // If you make a default construtor as well then you dont need to pass
    // parameters at the time of creating objects.
    // If you dont provide any default constructor, java compiler will do it for your implicity.
    public j3_Constructors() {
    // With the help of constructor we can make objects as they initialize the fields to their default values.
    }

    public long getAccountNumber() {
        return accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public void setAccountNumber(long accountNumber) {
        this.accountNumber = accountNumber;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPhoneNumber(int phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public int getPhoneNumber() {
        return phoneNumber;
    }
}
