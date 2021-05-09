public class Relational {

    public static void main(String[] args){

        int number1 = 10;
        int number2 = 15;

        System.out.println(number1 == number2); // false
        System.out.println(number1 != number2); // true
        System.out.println(number1 > number2);  // false
        System.out.println(number1 < number2);  // true

        int number3 = 10;

        System.out.println(number3 >= number2);  // false
        System.out.println(number3 <= number2);  // true
    }
}
