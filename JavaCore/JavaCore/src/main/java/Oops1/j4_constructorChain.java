package Oops1;
// Things you will learn in Oops1 - j4
// Construtor chaining
public class j4_constructorChain {
    // private variables : 
    private long accountNumber;
    private double balance;
    private String name;
    private String email;
    private int phoneNumber;

    // Five parameter Constructor :  to set the inital values of private variables.
    public j4_constructorChain(long accountNumber, double balance, String name, String email, int phoneNumber) {
        // Here this keyword is able to distinguish between the parameters passed and the variable names of this class.
        this.accountNumber = accountNumber;
        this.balance = balance;
        this.email = email;
        this.name = name;
        this.phoneNumber = phoneNumber;
    }

    // constructor chaining part - 1
    // Making another constructor say default construtor which  call the above constructor.
    // You dont have to call the above constructor separately now, the below constructor does the work of above constructor.
    public j4_constructorChain(){
        // you have to call constructor in first line statement. It is a rule.
        // You can call another constructor using this() syntax.
        this(4562, 1000, "sad", "s@gmail.com", 1234);
        // Now you use any other statemets like print :
        System.out.println("I have successfull called construtor which sets the initial values of variables");
    }
    
    // Constructor chaining part - 2 
    // In the below constructor we will pass 3 arguments and set the initial values for these arguments
    // Three parameter constructor : 
    public j4_constructorChain(String name, String email, int phoneNumber) {
        // Now I will call the five parameter constructor and set all five parameters.
        this(1234, 5678, name, email, phoneNumber); 
        // accountNumber and balance are set by you as default and the remaining parameters name,email,phoneNumber are
        // matched with the passed arguments.
    }

    // getters and setters 
    public double getBalance() {
        return balance;
    }
    public void setBalance(double balance) {
        this.balance = balance;
    }

    public long getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(long accountNumber) {
        this.accountNumber = accountNumber;
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(int phoneNumber) {
        this.phoneNumber = phoneNumber;
    }






}
