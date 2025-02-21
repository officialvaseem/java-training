import java.util.Arrays;;
public class Arrayequality {
    public static void main(String[] args) {
        int[]a={1,2,5,4,0};
        int[]b={2,4,5,0,1};
        boolean areEqual=Arrays.equals(a,b);
        System.out.println(areEqual);
    }
}
