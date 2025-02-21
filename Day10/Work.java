public class Work implements Citizen1{
    public static void main(String[] args) {
        // Work w=new Work();
        // Citizen1 w=new Work();
        // w.rule3();
        
        Citizen1 c=new Citizen1() {
            public void rule5(){
                System.out.println("keep silence");
            }
            
        };
        c.rule5();

        
    }
    Citizen1 c =() -> {
        System.out.println("keep silence-1");

    };
    c.rule5();
    
    
    

    
    
    public void rule3(){
        System.out.println("keep silence");
    }
    
}
