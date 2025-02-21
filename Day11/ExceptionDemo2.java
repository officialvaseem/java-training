public class ExceptionDemo2 extends ChildDemo {
    public static void main(String[] args) throws ArithmeticException {
        ExceptionDemo2 e= new ExceptionDemo2();
        try{
            e.divide(2,3);
        }
        catch(ArithmeticException ae){
            System.out.println("check second no");
        }
    }

    
}

