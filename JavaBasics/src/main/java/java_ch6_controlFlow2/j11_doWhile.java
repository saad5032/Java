package java_ch6_controlFlow2;
public class j11_doWhile {
    public static void main(String[] args) {
        // lets see the difference between for loop and while loop:
         // lets use boolean in while :
         int m = 1;
         boolean condition = true;
         while(condition){
             if(m>5){
                 break;
             }
             System.out.println(m);
             m++;
         }                              
         System.out.println("--------");  // output 12345

         int n = 1;
         boolean doWhileCondition = true;
         // The do gets executed once, then check for while condition (if true - 
         // do gets executed again) and continues
         do {    
            if (n>5){
                break;
            }
            System.out.println(n);
            n++;
         }while(doWhileCondition);
         System.out.println("--------"); // output 12345

         // lets understand do while in depth: here the while condition is false but 
         // the do gets executed once and output is 1
         int p = 1;
         boolean doWhileCondition2 = false;
         do {    
            if (p>5){
                break;
            }
            System.out.println(p);
            p++;
         }while(doWhileCondition2); // -> this semi colon is required.
         System.out.println("--------"); // output 1


         // let make the above code run, of variable p,
         //  by adding just one condition
         int q = 1;
         boolean doWhileCondition3 = false;
         do {    
            if (q>5){
                break;
            }
            System.out.println(q);
            q++;
            // lets make the doWhileCondition3 true here
            doWhileCondition3 = q>0; // q is obviously > 0 and 
            // q>0 returns true so condition3 is reassigned to true.

         }while(doWhileCondition3); // -> this semi colon is required.
         System.out.println("--------"); // output 1

        }

        }   
