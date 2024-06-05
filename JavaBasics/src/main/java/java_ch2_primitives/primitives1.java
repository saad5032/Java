package java_ch2_primitives;
    // The primitive datatypes are most basic datatypes in java. 
    // There are eight in total : byte,short,int,long | float,double | char | boolean.

    // Integer wrapper class
    // overflow and underflow problem of int 

public class primitives1 {

    // primitive datatype : int 
    int x = 10000; 
  
    // The compiler of java when executes this line detects int and tells computer to create int byte size memory for variable name x.
    // In this space 10000 can be easily fit. Thus primitive data types create a place for variable in memory.

    // lets see what is the minimum value and maximum value you can store in a variable declared with data type int :
    int minIntValue = Integer.MIN_VALUE; // output : -2147483648  // we can say Integer.MIN_VALUE is an expression.
    int maxIntValue = Integer.MAX_VALUE; // output : 2147483647
    // This means we cannot store a value less than -2147483648 and greater than 2147483647 in int variable.

    // Note :
    // Integer is wrappper class which has some variables defined in it. I am using MIN_VALUE varibale of it which tells us the minimum
    // value that we can store in a variable declared as int.

    public static void main(String[] args) {
        primitives1 obj = new primitives1();

        // The "+" sign when used in System.out.println() will print different datatypes together as single line of text.
        System.out.println("Min value of variable declared with int data type "+obj.minIntValue);
        System.out.println("Max value of variable declared with int data type "+obj.maxIntValue);
        // -------------------
        // Lets see what happens when we exceed the max int value by 1 and decrease the min int value by 1.
        System.out.println("Busted max value :"+(obj.maxIntValue+1));
        /*
        output of this : Busted max value : -2147483648, how max value became negative? 
      
        This concept is called overflow meaning we tried to put too large a number into the space allocated by the computer for an int.
        It didnt but the computer tried to fit in anyway.Instead of throwing an error it overflowed.
        */
        // -------------------
        System.out.println("Busted min value :"+(obj.minIntValue -1));
        /* 
        output of this : Busted min value : 2147483647, how min value became positive?
        Beacuse in the case of decreasing the min value further will result in underflow.
        */
        // -------------------
        // assigning a variable an int literal exceeding the supported range of int will trow an error.
        // int z = 2147483648;
        // System.out.println(z);
        // -------------------
        int a = 214_748_3644; // underscores improves readablity but the number is still 2147483644.
        System.out.println("output of a: "+a);
        // -------------------


    }

}
