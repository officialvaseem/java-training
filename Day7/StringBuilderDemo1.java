public class StringBuilderDemo1 {
    public static void main(String[] args) {
        String s="Berlin";
        StringBuilder sb=new StringBuilder(s);
        sb.append(" Munich");
        s=sb.toString();
        System.out.println(s);
        //reverse
        StringBuilder sb1=new StringBuilder("cat");
        sb1.reverse();
        System.out.println(sb1);
    }
}
