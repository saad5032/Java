package java_ch4_controlFlow;
public class j2_logical_AND_OR_operator {
public static void main(String[] args) {
    int x = 300;
    int y = 200;
    if (x>y && y<210){  // (x>y returns true && y<210 also return true, both conditions are true so if block is executed)
        System.out.println("logical And gets executed when all conditions return true");
    }

    if(x==y || y==200 || x==10){  // (x==y, x==10 returns false but y==200 return true) one condition is true so if block is executed
        System.out.println("logical OR gets executed, only when one condtion is true");
    }
}}
