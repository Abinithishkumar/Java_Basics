import java.util.Locale;

public class PrimitiveDataTypes {

    public static void main(String[] args){

        int myInt = 22 / 7;
        float myFloat = 22 / 7f;
        double myDouble = 22 / 7d;

        System.out.println("Int Value is:" + myInt);
        System.out.println("Float Value is:" + myFloat);
        System.out.println("Double Value is:" + myDouble);

        boolean loggedIn = false;
        System.out.println(loggedIn);

        char myChar = 'A';
        System.out.println(myChar);
        //      these 5 data type are the mainly used datatypes

        String myString = "Nithish Kumar";
        System.out.println("My string is: " + myString);

        String firstNumber = "1";
        String secondNumber = "5";
        System.out.println(firstNumber + secondNumber);

        System.out.println(myString.toLowerCase());
        System.out.println(myString.toUpperCase());
    }
}
