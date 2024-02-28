class B {
   public void p(double i) {
      System.out.println(i * 2);
   }
}

public class A2 extends B {
   public void p(int i) {
      System.out.println(i);
   }
   
   public static void main(String[] args) {
      A2 a = new A2();
      B b = new B();
      
      a.p(10);
      a.p(10.0);
      
      b.p(10);
      b.p(10.0);
   }
}
