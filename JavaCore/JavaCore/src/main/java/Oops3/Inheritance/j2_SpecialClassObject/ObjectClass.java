package Oops3.Inheritance.j2_SpecialClassObject;
public class ObjectClass extends Object{
// Things you will learn in Oops3 - ObjectClass - j1
// Object Class. You can extend Object class like above but you dont have to as Java does this automatically for you.
// Object class is Super class of all classes you make and also of build in classes like Integer, String etc. 
// This means we can use methods and functionalities of Object Class in any class we make.

public static void main(String[] args) {
    Student max = new Student("Syed", 25);
   // System.out.println(max.toString());  // output : Student@5fcfe4b2, the hashcode 5fcfe4b2 is unique to only max.
    // Using max as reference of Student Class Object, I am printing toString method of Object Class
    // which provides hashcode value unique to max reference variable.
    // This is why every object is uniquely printed using toString.

    // I overrided the toString method in Student Class below.
    Student kai = new Student("Saad", 30);
   // System.out.println(kai);  // even if you just print referece varaible, the toString get called.

    PrimarySchoolStudent itachi = new PrimarySchoolStudent("uchiha", 31, "madara");
    System.out.println(itachi); // This prints the toString of Student Class as it is parent of PrimarySchoolStudent class.
}
}
class Student{
    private String name;
    private int age;
    Student(String name, int age){ // Student Constructor
        this.name = name;
        this.age = age;
    } 
    @Override
    public String toString() {
        return name +" is "+ age +" years old ! ";  
        // This custom class Student its Super Class is automatically Object Class. So if you return super.toString 
        // the toString of Object class is returned and gives you same hashcode output.
    }
}
class PrimarySchoolStudent extends Student {
    private String ParentName;
    PrimarySchoolStudent(String name, int age, String ParentName){ // Have to pass same type as Student Constructor parameters.
        super(name, age); // calls Student Constructor - sets name and age variables
        this.ParentName = ParentName; // also sets parentName variable 
    }

    @Override
    public String toString(){
        return ParentName + " kid " + super.toString();
        // I am overriding the toString message of Student Class but I am combining my new 
        // message with old message by calling the Student Class toString.
    }
}