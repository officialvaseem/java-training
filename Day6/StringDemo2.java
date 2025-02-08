public class StringDemo2 {
    public static void main(String[] args) {
        String str=new String("hello");
        String str1=new String("hello");
        // do not use == to compare the content
        if(str.equals(str1))
        {
            System.out.println("same");
        }
        else{
            System.out.println("not same");
        }
    }
}
