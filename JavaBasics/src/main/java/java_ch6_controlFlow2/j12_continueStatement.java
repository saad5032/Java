package java_ch6_controlFlow2;

public class j12_continueStatement {
    // contine : helps to exit current iteration and start a new one.
    public static void main(String[] args) {
        // This loop will print numers 5,10,15,20,25,30
        int num = 0;
        while(num<30){
            num+=5;
            System.out.println(num);
        } 
        System.out.println("-----");
        // If you dont want to print 25, basically you want to skip that iteration then use continue
        // This loop will print numers 5,10,15,20,30 skipping 25
        int num1 = 0;
        while(num1<30){
            num1+=5;
            if (num1  == 25){   // if num1 is 25 i want to exit that iteration and start new one
                continue; 
            }
            System.out.println(num1);
        }
    }
}
