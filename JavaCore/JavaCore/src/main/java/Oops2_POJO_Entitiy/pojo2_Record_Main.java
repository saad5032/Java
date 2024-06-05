package Oops2_POJO_Entitiy;

public class pojo2_Record_Main {

    public static void main(String[] args) {

        // Lets make multiple objects at once using for loop
        for (int i = 1; i <= 5; i++) {
            // Lets use Record -
            pojo2_Record_Pojotype object = new pojo2_Record_Pojotype("0" + i,
                    switch (i) {
                        case 1 -> "Anas";
                        case 2 -> "Tauseef";
                        case 3 -> "Suja";
                        case 4 -> "Sami";
                        case 5 -> "Fahad";
                        default -> "Anonymous";
                    },
                    "0" + i + "-11-1997",
                    "JavaClass" + i);
            // System.out.println(object);

        }

        pojo1_Student PojoStudent = new pojo1_Student("200", "Saad", "20-32-1223", "sdrfv");
        pojo2_Record_Pojotype RecordStudent = new pojo2_Record_Pojotype("1", "syed", "2-3-1990", "Record java class");

        // retreiving date of birth value
        System.out.println(PojoStudent.getDateOfBirth()); // from Pojo class.
        System.out.println(RecordStudent.dateOfBirth()); // from Record. (just type nameofVariable and paranthesis)

        // Manippulating or set the date of birth value
        PojoStudent.setDateOfBirth("21-32-1224");
        // RecordStudent.setDateOfBirth("4-5-1991"); It throws error as you see we
        // cannot set or change Record variables.

    }
}
