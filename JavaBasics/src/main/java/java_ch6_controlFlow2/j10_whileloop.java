package java_ch6_controlFlow2;
public class j10_whileloop {
    public static void main(String[] args) {
        // let see the difference between for and while
        for(int i=1; i<=5 ; i++){ 
            //initialization, condition (for loop continue until 
            //this condition is false) and increment is done on same line
            System.out.println(i);
        }
        System.out.println("-------");  // output 12345

        // You use while loop if you dont know how many times you need to loop ahead
        int j =1; // initialization done outside
        while(j<=5){ // only conition (while loop continue until this condition is false) is in while loop
            System.out.println(j);  
            j++; // You have to increment here.
        }
        System.out.println("-------");  // output 12345

        // lets use break with while loop:
        int k = 1;
        while(true){  // pass true here 
            if(k>5){
                break;   // while loop exits as the condition in if statement is met
            }
            System.out.println(k);
            k++;
        }
        System.out.println("-------");  // output 12345

        // lets use boolean in while :
        int m = 1;
        boolean condition = true;
        while(condition){
            if(m>5){
                break;
            }
            System.out.println(m);
            m++;
        }                               // output 12345
    }
}
