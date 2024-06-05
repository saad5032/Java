package Oops2_POJO_Entitiy;

public class pojo1Main {
    public static void main(String[] args) {
    // Lets make multiple objects at once using for loop
    for(int i=1; i<=5 ; i++){
        // Each time, the id and name parameters changes
        pojo1_Student object = new pojo1_Student("0"+i, 
        switch(i){
            case 1 -> "Anas";
            case 2 -> "Tauseef";
            case 3 -> "Suja";
            case 4 -> "Sami";
            case 5 -> "Fahad";
            default -> "Anonymous";
        }, 
        "0"+i+"-11-1997",
        "JavaClass"+i);
        System.out.println(object);
    }
    }
}
