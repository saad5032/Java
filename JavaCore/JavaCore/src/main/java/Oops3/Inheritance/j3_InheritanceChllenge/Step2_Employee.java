package Oops3.Inheritance.j3_InheritanceChllenge;
// Employee class - child of Worker class
public class Step2_Employee extends Step1_Worker{
    private long employeeId;
    private static int employeeNo = 1; // static variable value is remebered by all objects.
    private String hireDate;

    // Default constructor to make object and sets default values for all fields, this class and its parent for this class object 
    public Step2_Employee(){
        super();  // calls default constructor of parent which sets default values for parent fields for this class object.
    }

    // Args Constructor to make object and to set values for the above fields and also the fields of parent for this class object.
    public Step2_Employee(String name,String birthDate,String hireDate){
        super(name, birthDate); // calls parent Args constructor.
        this.employeeId = Step2_Employee.employeeNo++; 
        //Since employeeNo is static variable we have to call using class name with dot method.
        //Each time this constructor is called that is any object of this class or its child class is made using this constructor
        //the employee no gets incremented and alloted uniquely to every object, So employeeID value which is static is shared
        //and remebered by all objects.
        this.hireDate = hireDate;
    }

    // toString to print fields for this class objects.
    @Override
    public String toString() {
        return "Employee { employeeId : " + employeeId + ", hireDate : " + hireDate + "} and " + super.toString();
        // Adding toString of parent class to print parent fields for this class object.
    }

}
