package Oops2_POJO_Entitiy;
// Things you will learn in Oops2 - pojo2
// Record 
// Record and Pojo difference 

public record pojo2_Record_Pojotype(String id, String name, String dateOfBirth, String className) {
// You can see the keyword used here is record and not class.
/* 
- It is class or a type that is of POJO. It does the same functionality that of POJO class
- All you have to do is pass the variables - column names of database.
- The constructor, toString functionality is done automatically by Record implicitly(automatically).
- You can see the result in main method that runs this record is same as the result in main
  method that runs POJO class. 
*/
}
