import java.util.Arrays;

public class Memory {
    public static void main(String[] args) {
        int[] zig=new int[4];//0 5 0 0
        int zag[]=zig;
        zag[1]=5;
        zag=new int[4];// 0 9 0 0
        zag[2]=9;
        System.out.println(Arrays.toString(zag));
        System.out.println(Arrays.toString(zig));
    }
}
