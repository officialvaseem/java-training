import java.util.Scanner;
public class Array1 {
    public static void main(String[] args) {
        //1st way
        int []a={1,2,3,4,5};
        System.out.println(a);//[I@372f7a8d
        for(int i=0;i<a.length;i++){
            System.out.println(a[i]+" ");
        }
        // 2nd way;
        Scanner sc=new Scanner(System.in);
        int b[]=new int[5];
        for(int i=0;i<b.length;i++)
        {
            b[i]=sc.nextInt();// it used to get the user inpput nd store in the array  value
        }
        for(int value:b) // forEach loop
        {
            System.out.print(value+" ");
        }

    }

    
}