public class StringBuilderDemo {
    public static void main(String[] args) {
        String s1="Muffins";
        String s2=s1;
        s1="pqr";
        System.out.println(s1==s2);
        StringBuilder sb=new StringBuilder("abc");
        StringBuilder sb1=new StringBuilder("abc");
        //sb.append("abc");
        System.out.println(sb == sb1);
        //sb.append("abc");
        System.out.println(sb.equals(sb));
        sb.append("abc");

    }
}
