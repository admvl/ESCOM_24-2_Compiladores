class A {
   int i;
}

class B extends A {
   int i;

   B(int a, int b) {
      super.i = a;
      i = b;
   }

   void mostrar() {
      System.out.println("Campo de dato i en la superclase " + super.i);
      System.out.println("Campo de dato i en la subclase " + i);
   }
}

public class UsoSuperMiembro {
   public static void main(String[] args) {
      B subO = new B(31, 77);

      subO.mostrar();
   }
}
