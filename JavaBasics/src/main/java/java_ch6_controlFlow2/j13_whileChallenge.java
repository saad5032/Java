package java_ch6_controlFlow2;

public class j13_whileChallenge {
    /*
    1. Create a method called isEvenNumber, that takes a parameter of type int. Its purpose is to determine if 
    the argument passed to the method is an even number or not. 
    2. Return true from the method, if it's an even number, otherwise return false.
    3. Next, use a while loop to test a range of numbers, from 5, up to and including 20, but printing out only the even numbers, 
    determined by the call to the isEvenNumber method
    So, Step 2 is to modify the while code.
    1. Make it also record the total number of even numbers it has found.
    2. Break out of the loop, once 5 even numbers are found.
    3. Finally, display the total number of odd and even numbers found.
     */
    public static boolean isEvenNumber(int num){
        if (num%2 == 0){
            System.out.println(num + " is an even number");
            return true;
        } 
        // System.out.println(num + " is not an even number");
        return false;
    }
    public static void main(String[] args) {
            int number = 5;  // start from 5
            int evenCounter = 0;
            int oddCounter = 0;
            while(number<=20){  // continue till the number is 20
                // call the method to check whether number is even or not and increase the counter
                if(isEvenNumber(number)){
                    evenCounter++;
                }else{
                    oddCounter++;
                }
                // break out of while loop if the count of even numbers is 5
                if(evenCounter == 5){
                    break;
                }
                number++;  // after 5 is done, increment to 6 and so on.
            }
            System.out.println("Total number of even numbers found : "+evenCounter);
            System.out.println("Total number of odd numbers found : "+oddCounter);
        }}
