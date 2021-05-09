import java.util.Scanner;
public class compare {

//    public static void main(String[] args){
//
//        int a = 10;
//        int b = 10;
//
//        if (a > b){
//            System.out.println(a+" is greater than "+b);
//        } else if (a < b){
//            System.out.println(b+" is greater than "+a );
//        } else {
//            System.out.println(a+" and "+b+" are equal");
//        }
//
//    }
    public static void main(String[] args){

        int a ;
        int b ;

        Scanner input = new Scanner(System.in);

        System.out.println("Enter the number1, a: ");
        a = input.nextInt();

        System.out.println("Enter the number2, b: ");
        b = input.nextInt();

        if(a > b){
            System.out.println(a+" is greater than "+b);
        }else if(b>a){
            System.out.println(b+" is greater than "+a);
        }else{
            System.out.println(a+" is equal to "+b);
        }
    }
}
