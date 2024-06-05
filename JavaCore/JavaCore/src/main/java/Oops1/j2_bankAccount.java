package Oops1;

/*
Create a new class for a bank account.
- Create fields for account characteristics like:
  account number
  account balance
  customer name
  email
  phone number
- Create getters and setters for each field.
- Create two additional methods:
  one for depositing funds into the account
  one for withdrawing funds from the account
 */

public class j2_bankAccount {
    // Instance fields used so that objects can have different values 
    private long accountNumber;
    private double balance;
    private String name;
    private String email;
    private int phoneNumber;

    // getters and setters to retrieve and set the values as per desired by objects
    public long getAccountNumber() {
        return accountNumber;
    }
    public void setAccountNumber(long accountNumber) {
        this.accountNumber = accountNumber;
    }
    public double getBalance() {
        return balance;
    }
    public void setBalance(double balance) {
        this.balance = balance;
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

// Create two additional methods:
// one for depositing funds into the account
// one for withdrawing funds from the account

public void deposit(double depositAmount){
    this.balance += depositAmount;
}

public void withdraw(double withdrawAmount){
    if ((this.balance - withdrawAmount)<0){
        System.out.println("Insufficient funds");
    }else{
        this.balance-=withdrawAmount;
        System.out.println("The amont withdrawn is "+withdrawAmount
        + "$ and remaining balance is "+this.balance+"$");
    }

}

// lets make a constructor
public j2_bankAccount(long accountNumber,double balance,String name,String email,int phoneNumber){
    this.accountNumber = accountNumber;
    this.balance = balance;
    this.email = email;
    this.name = name;
    this.phoneNumber = phoneNumber;
}

public j2_bankAccount(){
    
}
}
