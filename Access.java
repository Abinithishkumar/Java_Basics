public class Access {
//    public - visible to everyone
//    private - visible only to the class
//    protected - visible only to package and all subclass
//    static - codes can be changed
//    final - codes cannot be changed
    public static void main(String[] args) {
        System.out.println("Hello World");
        sayHello();

//        int num1 = 10;
//        int num2 = 20;
//        int result = largeNumber(num1, num2);

//        int result = largeNumber(5, 10);
//        System.out.println(result);

        System.out.println(largeNumber(10, 20));
    }

    public static void sayHello(){
        System.out.println("Hello Java");
    }

    public static int largeNumber(int num1, int num2){

        int min;
        if ( num1 > num2){
            min = num1;
        }else{
            min = num2;
        }
        return min;
    }
}
