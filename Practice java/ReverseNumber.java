public class ReverseNumber {

    public static void rev(int num) {
        int reversed=0;
        while (num > 0) {
            reversed = reversed *10+num%10;
            num/=10;
            
        }
        System.out.println("Reversed number:"+reversed);
    }
    public static void main(String[] args) {
        int num=1234;
        rev(num);
    }
}