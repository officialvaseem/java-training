package tamilnadu.chennai;
public class Office {
   public Office() {
   }

   public static void main(String[] var0) {
      Office var1 = new Office();
      var1.work();
      var1.do_planning();
   }

   void work() {
      System.out.println("working in office");
   }

   void wfh() {
      System.out.println("working in home");
   }

   void recruit() {
      System.out.println("recruitment");
   }

   void get_travel_allowance() {
      System.out.println("get money");
   }

   private void do_planning() {
      System.out.println("planning");
   }
}


