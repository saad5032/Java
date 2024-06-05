package Oops1;
public class j3_Main {
public static void main(String[] args) {
// I have defined only constructor which takes data, means parameters. 
// Using this constructor i will make object but for this object I have to pass data.
j3_Constructors obj = new
    j3_Constructors(1234,
     1000, "syed", "s@gmail.com", 
     0123);

// I have defined default contructor in class so i now have option to create object with no parameter passing.
// obj 2 created using default constructot. But for this object you need to use setter to set the initial data.
j3_Constructors obj2 = new j3_Constructors();
obj2.setName("Saad");
System.out.println("object 2 name : "+obj2.getName());
System.out.println( "--------------");
// Object 1 
System.out.println("Object 1 name : "+obj.getName());
System.out.println(obj.getBalance());
obj.deposit(1000);
System.out.println(obj.getBalance());
obj.withdraw(2000);
obj.withdraw(1);
}}
