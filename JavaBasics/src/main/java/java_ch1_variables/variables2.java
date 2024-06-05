package java_ch1_variables;

public class variables2 {

    // challenge 1: 
    // add values of two defined variables and assign it to undefined variable total(not assigned to any value) answer is yes.
    int mySecondNumber = 12;  
    int myThirdNumber = 6;
    int total = mySecondNumber+myThirdNumber;

    // challenge 2: multipy value of a defined varible with 2 and assign it to undefined variable. answer is yes.
    int multiplyVariable = mySecondNumber *2 ;

    /*
       challenge 3: 
    First create a new variable and call it myLastOne :
    1. Its data type should be int.
    2. It should be set to the value of 1000, minus (or less than) the value in the total variable.
    */

    int myLastOne = 1000 - total;
    public static void main(String[] args) {
        variables2 obj = new variables2();
        System.out.println(obj.total);
        System.out.println(obj.multiplyVariable);
        System.out.println(obj.myLastOne);
    }
}
