public class ShiftStringchar {
    public static void main(String[] args) {
        String str="abc";
        int n=3;
        StringBuilder result=new StringBuilder();
        for(char c:str.toCharArray())
        {
            result.append((char)(c+n));
        }
        System.out.println(result.toString());
    }
}
