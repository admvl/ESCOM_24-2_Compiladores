class B {
   public void p(double i) {
      System.out.println(i * 2);
   }
}

public class A extends B {
   public void p(double i) {
      System.out.println(i);
   }
   
   public static void main(String[] args) {
      A a = new A();
      a.p(10);
      a.p(10.0);
            
   }
}
