package Oops1;

public class j5_Main {
public static void main(String[] args) {

    j5_Customer customer1 = new j5_Customer("Saad", 2000, "s@gmail.com");
    System.out.println(customer1.getCreditLimit()); // First constructor 

    j5_Customer customer2 = new j5_Customer(); // default constructor
    System.out.println(customer2.getCreditLimit());

    j5_Customer customer3 = new j5_Customer("sad", "s@gmail.com");
    System.out.println(customer3.getCreditLimit()); // Last constructor
}
}

