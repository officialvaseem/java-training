public class Reversewords {
    public static void main(String[] args) {
        String s1="Happy morning";
        String[] words=s1.split("");
        for(int i=words.length-1;i>=0;i--)
        {
            System.out.println(words[i]+" ");
        }
    }
}