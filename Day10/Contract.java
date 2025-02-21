public interface Contract {
    public static void main(String[] args) {
        System.out.println("hello");
    }
    default void display(){
        System.out.println("iam from display");
    }
    static void print()
    {
        System.out.println("iam from print");
    }
    default void calculate(int a,int b){
        System.out.println(a-b);
    }
    public abstract void result();   
} 
// we can have static and non-static(default)method in interface

