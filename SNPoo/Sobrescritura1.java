class A {
   public void metodoA(double i) {
      System.out.println( i * 2 );
   }
   
   public void metodoB() {
       System.out.println(" Error ");
   }
}
       
class B extends A {
    public void metodoA(double i) {
      //System.out.println( i );
      super.metodoA(7);
    }
}
    
public class Sobrescritura1 {
   public static void main(String[] args) {
       A a = new A();
       B b = new B();
       
       b.metodoA(7);
       b.metodoA(7);
       b.metodoB();
       a.metodoA(10.3);
   }
}

// La salida para la primera corrida (es cuando se
//     comentan las líneas 20, 26 y 13) :
//      10.0
//      10.2
//       Error

// La salida para la segunda corrida (es cuando se
//  comenta las líneas 20 y 26) :
//      10.0
//      10.2
//       Error
//      20.6

// La salida para la tercera corrida (es cuando se 
//    comenta la línea 13) :
//      14.0
//      14.0
//       Error
//      20.6
