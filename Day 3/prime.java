
public class prime {
    public static void main(String[] args) {
        int n=11;
        int div=2;
        boolean prime=true;

        while (div <=n/2){
            if(n % div ==0){
                prime=false;
            }

        }
        System.out.println(prime?"prime":"not a prime");
    }
}
