public class ExceptionDemo {
    public static void main(String[] args) {
        int a=10;
        int b=0;
        System.out.println(a/b);
        // exception in thread "main"  java.lang.ArithmeticException: / by zero
        try{
            System.out.println(a/b);
        }
        catch(ArithmeticException abc)
        {
            System.out.println("check b value");
        }
        System.out.println("hi");
    }
}
