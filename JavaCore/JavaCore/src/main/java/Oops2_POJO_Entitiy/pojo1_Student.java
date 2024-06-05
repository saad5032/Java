package Oops2_POJO_Entitiy;
// Things you will learn in Oops2 - pojo1
// Entity or pojo class its structure/pattern
// toString()
public class pojo1_Student {
    private String Id;
    private String Name;
    private String DateOfBirth;
    private String ClassName;

    // We can just use constructor to create and set the object initial values without getters 
    // and setters at present.
    public pojo1_Student(String id, String name, String dateOfBirth, String className) {
        this.Id = id;
        this.Name = name;
        this.DateOfBirth = dateOfBirth;
        this.ClassName = className;
    }

    // Every time we see keyword that starts with @ symbol, this is called annotation.
    @Override

    /* 
    - to String :
    - It is a special method in Java, We can implement this method in any class we create
    - Using toString, we will know the current state of out object, meaning if you created 5 objects of the class,
    each object has this class variable values. Now toString will print all the objects varaibles and their values.
    You dont have to use separate print statements to print the object variables.
    */ 
    public String toString() {
        return "pojo1_Student [Id = " + Id + ", Name = " + Name + ", DateOfBirth = " + 
        DateOfBirth + ", ClassName = "
                + ClassName + "]";
    }

    public String getId() {
        return Id;
    }

    public void setId(String id) {
        Id = id;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getDateOfBirth() {
        return DateOfBirth;
    }

    public void setDateOfBirth(String dateOfBirth) {
        DateOfBirth = dateOfBirth;
    }

    public String getClassName() {
        return ClassName;
    }

    public void setClassName(String className) {
        ClassName = className;
    }


    
}
