package ImportantConcepts;
/*
You'll be using an endless loop which:
1. Prompts the user to enter a number, or any character to quit.
2. Validates if the user-entered data really is a number, you can choose either an integer, or double validation method.
3. If the user-entered data is not a number, quit the loop.
4. Keep track of the minimum number entered.
5. Keep track of the maximum number entered.
If the user has previously entered a set of numbers (or even just one), display the minimum, and maximum number, which the user entered.
 */

import java.util.Scanner;

public class j7_challenge2 {
    public static String UserMinMax(){
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter a number to continue or enter any character to quit the console");
       
    boolean userNumber = true;
    double minimum = 100000.0d;
    double maximum = 0.0d;
    int count = 0 ;
    do{
        try {
            String StringNumber = sc.nextLine();
            double number = Double.parseDouble(StringNumber);
            count+=1;
            if (number < minimum){
                minimum = number;
            }else if (number>maximum){
                maximum = number;
            }
        } catch (NumberFormatException message) {
            System.out.println("You have not entered the number, the console quits ");
            userNumber = false;
        }
    }while(userNumber);
    
    if (count == 0){
        minimum = 0.0;
        return "The min of all numbers : "+ minimum+"\n"+"The max of all numbers : "+maximum;
    }
    return "The min of all numbers : "+ minimum+"\n"+"The max of all numbers : "+maximum;
    }


    public static void main(String[] args) {
        System.out.println(UserMinMax());
    }

}
