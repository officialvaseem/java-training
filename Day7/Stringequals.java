public class Stringequals {

    public static void main(String[] args) {
       // String s1=new String("ABC");//heap
        //String s2=s1;
        //s2="ABC";
        //if(s1==s2)
        //{
        //    System.out.println("s1 s2 are ==");
        //}
        //else{
         //   System.out.println("s1 s2 are not ==");
        //}

        String s1="ab";
        String s2="abc";
        s1+='c';
        System.out.println(s1==s2);

        //String s1=new String("abc");
        //String s2=new String("abc");
        //System.out.println(s1==s2);

        //String s1=new String("abc");
        //String s2=s1;
        //System.out.printtln(s1==s2);
    }
}