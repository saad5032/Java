package Oops1;
public class j4_Main {
    public static void main(String[] args) {

    
    System.out.println("--------obj1-------");
    // I will now just use default constructor to make object.
    // This default constructor will call the other constructor and sets the initial values of variables.
    j4_constructorChain obj = new j4_constructorChain(); 
    System.out.println(obj.getBalance());

    System.out.println("--------obj2-------");
    j4_constructorChain obj2 = new j4_constructorChain("saad", "s@gmail", 01234);
    System.out.println(obj2.getName());
    System.out.println(obj2.getBalance());
    }
}
