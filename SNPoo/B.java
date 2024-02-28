class A {
   final void metodoA() {
      System.out.println(" Metodo final ");
   }
}
       
class B extends A {
    void metodoA() {
      System.out.println(" Metodo en A ");
    }
   
    void metodoB() {
       System.out.println(" Error ");
    }
    
    public static void main(String[] args) {
       B ob = new B();
       
       ob.metodoA();
       //ob.metodoB();
    }
}
