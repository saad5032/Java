package java_ch4_controlFlow;

public class j3_ternary_operator {
public static void main(String[] args) {
    String myCar = "Mercedez";
    boolean isMycar = (myCar=="Mercedez") ? true : false;  // returns boolean so isMyCar should be of type boolean
    System.out.println(isMycar);  // this should be true

    String isItMyCar = (myCar=="Mercedez") ? "Yes" : "No"; // returns String so isItMyCar should be of type String
    System.out.println(isItMyCar);


}
}
