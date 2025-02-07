import java.util.Scanner;
 class Squareroot {
    public static void main(String[] args) {
        int n= 6565;
        int div=2;
        while(div<=n/2)
        {
            if(n/div==div){
                System.out.println(div);
                break;
            }
            div++;
        }
    }
    
}

