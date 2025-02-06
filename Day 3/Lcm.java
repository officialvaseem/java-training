
import java.util.Scanner;

public class Lcm{
    public static void main(String[] args) {
        int n1, n2;
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the first number:");
        n1 = sc.nextInt();
        System.out.println("enter the second number:");
        n2 = sc.nextInt();

        int lcm = (n1 > n2) ? n1 : n2; 
    
 
 

        while (true) {
            if (lcm % n1 == 0 && lcm % n2 == 0) { 
                System.out.println("LCM of entered numbers:" + lcm); 
                break;
            }
        }
        sc.close(); 
    }     
}

