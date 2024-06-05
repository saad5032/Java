package Oops1;

public class j2_Main {
    public static void main(String[] args) {
        j2_bankAccount person1 = new j2_bankAccount();
        person1.setAccountNumber(1234567812);
        person1.setBalance(2000);
        person1.setEmail("saad@gmail.com");
        person1.setName("saad");
        person1.setPhoneNumber(12345678);

        person1.deposit(345);
        System.out.println(person1.getBalance());

        person1.withdraw(345);
        person1.withdraw(2000);
        person1.withdraw(1);

    }

}
