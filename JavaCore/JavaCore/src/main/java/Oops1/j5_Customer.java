package Oops1;
public class j5_Customer {
/*
So for this challenge, you'll want to:
- Create a new class, called Customer, with three fields:
  name
  credit limit
  email address.
- Create the getter methods only, for each field.  You don't need to create the setters.
- Create three constructors for this class:
  First, create a constructor for all three fields which should assign the arguments directly to the instance fields.
  Second, create a no args constructor that calls another constructor, passing some literal values for each argument.
  And lastly, create a constructor with just the name and email parameters, which also calls another constructor.*/
private String name;
private double creditLimit;
private String emailAddress;

// First Constructor to initialze above all three variables also making object using this constructor.
j5_Customer(String name, double creditLimit, String emailAdress){
    this.name = name;
    this.creditLimit = creditLimit;
    this.emailAddress = emailAdress;
}

// Second Constructor (takes no args passed means default constructor) calls first constructor:
j5_Customer(){
    // Calling first constructor using this() syntax. Here you set default values for all three variables.
    this("Saad", 4000, "s@gmail.com"); 
}

// Last constructor that takes name and email args and call 
j5_Customer(String name, String email){  // name and email are passed to last constructor.
    // Calling first constructor, here creditLimit needs to be passed yourself.
    this(name, 1000, email);  // name and email from last constructor are passed to first constructor.
}

// getters
public String getName() {
    return name;
}
public double getCreditLimit() {
    return creditLimit;
}
public String getEmailAddress() {
    return emailAddress;
}}

