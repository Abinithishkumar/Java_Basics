public class Arithmetic {

    public static void main(String[] args){

        int number1 = 10;
        int number2 = 20;
        int number3 = 35;

        System.out.println(number1 + number2); // Addition
        System.out.println(number3 - number1); // subtraction
        System.out.println(number1 * number2); // Multiplication3
        System.out.println(number3 / number1); // Division will return quotient
        System.out.println(number3 % number1); // Division will return remainder

//        int number4 = number1 + 1;
//        System.out.println(number4);

//        number1++;   // post increment
        System.out.println(number1++); // in post increment 1st number will be printed and get incremented
        System.out.println(number1);   // thats why here we get number1 as 11 actually its value is 10 but in above code the number1 is get incremented after printing
        System.out.println(++number1); // here we using pre increment, thats why 1st number gets incremented and will be printed..
    }
}
