public class User {
    public static void main(String[] args) {
    //     Calculator c=new Calculator() {
    //         public void add(int a, int b){
    //             System.out.println(a+b);
    //         }
    //     };
    //     c.add(2,3);
    
    Calculator c = (a, b) -> System.out.println(a + b); // Lambda expression implementation
        
    // Calling the add method
    c.add(2, 3);  // Output: 5
}
}
    
    
    

