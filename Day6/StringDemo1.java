public class StringDemo1 {
    public static void main(String[] args) {
        //1st way
        String str="hello world!";
        String str1=new String("hello world!");
        for(int i=0;i<str.length();i++)
        {
            System.out.println(str.charAt(i));
        }
    }
}
