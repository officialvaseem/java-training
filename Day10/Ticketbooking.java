import java.util.function.Predicate;

public class Ticketbooking {

    public static void main(String[] args) {
        //Ticketbooking tb=new Ticketbooking();
        //System.out.println(tb.Test(65));

       // Predicate<Integer> p=(amount)->(amount>60);
       // System.out.println(p.test(65));

       int a[]={2,4,6,8,10,12,11};
       Predicate<Integer>p=(n)->(n%2!=0);
       Predicate<Integer>p1=(n)->(n%2==0);
       check(p,a);
       check(p1,a);
       //or,negate,and
       check(p.and(p1),a);
    }
    public static void check(Predicate<Integer>p,int a[]){
        for(int i:a){
            boolean result=p.test(i);
            if(result)
            {
                System.out.println(i+" ");
            }
        }
    }

    //public boolean Test(int amount){
    //    if(amount>60){
      //      return true;
      //  }
      //  else{
      //      return false
      //  }
   // }
}