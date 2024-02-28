class A {
   void metodoA() {
      System.out.println(" Metodo final ");
   }
   
   void metodoB() {
       System.out.println(" Error ");
    }
}
       
class B extends A {
    void metodoA() {
      System.out.println(" Metodo en A ");
    }
   
}

public class Sobrescritura {
    public static void main(String[] args) {
       A a = new A();
       B b = new B();
       
       b.metodoA();
       a.metodoA();
       b.metodoB();
       
    }
}

// La salida es:
//     Metodo en A 
//     Metodo final 
//     Error
