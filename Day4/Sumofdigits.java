import java.util.Scanner;

public class Sumofdigits {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("enter the number:");
        int n =sc.nextInt();


        int sum=sumofDigits(n);
        while(sum>9){
            sum=sumofDigits(sum);
        }
        System.out.println(sum);
    }
    public static int  sumofDigits(int n)
    {
        int sum=0;
        while(n!=0){
            int rem=n%10;
            sum+=rem;
            n=n/10;

        }
        return sum;
    }
}
