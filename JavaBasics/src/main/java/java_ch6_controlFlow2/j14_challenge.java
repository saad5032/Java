package java_ch6_controlFlow2;
/*  In this challenge, your task is to write a method, with the name sumDigits, that has a single parameter named number, 
    of type int, and it should return an int.
    1. The method should only take a number that is a positive number. 
    2. If a negative number is passed, it should return -1, meaning an invalid value was passed.
    3. The method should parse out each digit from the number, and sum the digits up.
So if 125 is the value passed to the method, the code should sum each digit, in this case, 1 + 2 + 5, and return 8, as a value.
And another example, if the value is 1000, the code should sum each digit, 1 + 0 + 0 + 0, and return 1 as a value.
If the number is a single digit number, simply return the number itself as the result.

1st iteration :
    number = 1234, and our variable, sum = 0.
    If we use the remainder operator, getting the remainder of the number divided by 10, this will give us the most right digit 
    in the number:
    1234 % 10 = 4    --> And 4 is the last digit, or most right digit. 
    Since we'll be working through the digits, from right to left, we'll add this to sum:
    sum = 4
    Next, we want to drop the most right digit, 4, and just have the other 3 digits to process.
    We can do this by dividing by 10:
    1234 / 10 = 123
Then 2nd, 3rd ... iterations follow up.
 */
public class j14_challenge {
    public static int sumDigits(int number) {
        int sum = 0;
        if (number < 0) {
            return -1;
        }
        while (number > 9) {         // For all numbers >= 10. say number is 10 --> (10>9)
            sum += number % 10;      // right most digit of number is added to sum variable using %10 --> sum += 0
            number = number / 10;    // removing right most digit using /10 , and reassign the number. --> number = 1
        }
        sum += number;  // for number < 10, if number is 8 then we just add number to the sum  --> sum += 1
        return sum;
    }
        public static void main(String[] args) {
        System.out.println("Num 10 -> 1+0 = "+sumDigits(10));
        System.out.println("Num 288 -> 2+8+8 = "+sumDigits(288));
        System.out.println("Num -12 (return -1) = "+sumDigits(-12));
        System.out.println("Num 4 -> 4 = "+sumDigits(4));
    }}
        

        
