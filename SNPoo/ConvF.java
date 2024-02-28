public class ConvF {
   private boolean x;

   private int convertidor() {
      return x ? 1 : 1;
   }
   
   public static void main(String[] args) {
      ConvF f = new ConvF();
      System.out.println(f.x);
      System.out.println(f.convertidor());
   }
}
