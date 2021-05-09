import java.util.Scanner;
public class addtwonumbers{
    public static void main(String[] args){
//        declaring variables
        int firstNumber;
        int secondNumber;
        int result;

        Scanner input = new Scanner(System.in);

//        getting input from the user.
        System.out.println("Enter the number 1:");
        firstNumber = input.nextInt();

        System.out.println("Enter the number 2:");
        secondNumber = input.nextInt();

        result = firstNumber + secondNumber;

        System.out.println(result);
    }

}
// TODO: 04-05-2021 hiii