class A {
   public final void metodoA(double i) {
      System.out.println( i * 2 );
   }
   
   public void metodoB() {
       System.out.println(" Error ");
    }
}
       
class Bb extends A {
    public void metodoA(double i) {
      System.out.println( i );
    }
    
    public static void main(String[] args) {
       Bb b = new Bb();
       
       b.metodoA(10);
       b.metodoA(10.0);
       b.metodoB();
   }
}
