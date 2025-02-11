public class Merge {
    public static void main(String[] args) {
        String word1="abc",word2="pqr";
        StringBuilder merged=new StringBuilder();
        int i=0,j=0;
        while(i<word1.length()||j<word2.length())
        {
            if(i<word1.length())
            merged.append(word1.charAt(i++));
            if(j<word2.length())
            merged.append(word2.charAt(j++));
        }
        System.out.println(merged.toString());

    }
}
