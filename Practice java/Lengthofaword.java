public class Lengthofaword {
        public static void main(String[] args) {
            String s="fly me to the moon";
            String[] words=s.trim().split(" ");
            System.out.println(words[words.length-1].length());
        }  
}