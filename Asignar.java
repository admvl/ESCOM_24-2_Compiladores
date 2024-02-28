class A {
   void llamar() {
      System.out.println("Dentro del método llamar() de la clase A ");
   }
}

class B extends A {
   void llamar() {
      System.out.println("Dentro del método llamar() de la clase B ");
   }
}

class C extends A {
   void llamar() {
      System.out.println("Dentro del método llamar() de la clase C ");
   }
}

class Asignar {
   public static void main(String[] args) {
      A a = new A();
      B b = new B();
      C c = new C();

      A r;
      r = a;
      r.llamar();

      r = b;
      r.llamar();

      r = c;
      r.llamar();
   }
}
