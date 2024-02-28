class B {
   public void p(double i) {
      System.out.println(i * 2);
   }
}

public class A1 extends B {
   public void p(int i) {
      System.out.println(i);
   }
   
   public static void main(String[] args) {
      A1 a = new A1();
           
      a.p(10);
      a.p(10.0);
      
   }
}
