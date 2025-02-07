public class Pattern8 {

    public static void main(String[] args) {
        int n=5;
        for(int i=1;i<n*2;i++){
            int totalColInRow=i>n?2*n-i:i; //calc the total no of rows //using ternary operator the formula is used to find only the half of the pattern
            int spaces=n-totalColInRow;
            for(int j=1;j<=spaces;j++){
                System.out.print("");
            }
            for(int k=totalColInRow;k>0;k--){
                System.out.print(k);
            }
            for(int l=2;l<=totalColInRow;l++){ //to print the right side of the pattern
                System.out.print(l);
            }
            System.out.println();
        }
    }
}
