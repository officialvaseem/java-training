public class Countnumbersofzero {
    public static void main(String[] args) {
        int number=1670007080;
        int count=0;
        while(number!=0)
        {
            if(number%10==0)
            {
                count++;
            }
            number=number/10;
        }
        System.out.println("Number of zeros:"+ count);
    }
    
}
