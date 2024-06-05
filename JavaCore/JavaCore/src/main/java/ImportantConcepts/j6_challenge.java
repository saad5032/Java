package ImportantConcepts;
import java.util.Scanner;
public class j6_challenge {
    /* In this challenge, you'll read 5 valid numbers from the console, entered by the user, and print the sum of those five numbers.
    You'll want to check that the numbers entered, are valid integers. If not, print out the message "Invalid number" to the console,
    but continue looping, until you do have 5 valid numbers. Before the user enters each number, prompt them with the message,
    "Enter number #x:", where x represents the count, 1, 2, 3, etc.And as an example there, the first message would look something like,
    "Enter number #1:", the next, "Enter number #2:", and so on.*/
public static String SumUserNumbers() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter five numbers :");
        boolean countBoolean = true;
        int count = 1;
        int sum = 0;
        do{
            try {
            System.out.println("Enter number "+count+":");
            String number = sc.nextLine();
            int num = Integer.parseInt(number);
            sum += num;
            count++;
            countBoolean = count > 5 ? false : true;
        } catch (NumberFormatException e) {
            System.out.println("Invalid number, enter the number again !!!");
        }}while(countBoolean);
    return "The sum of all numbers is : "+sum;
}
public static void main(String[] args) {
    System.out.println(SumUserNumbers());
}}
