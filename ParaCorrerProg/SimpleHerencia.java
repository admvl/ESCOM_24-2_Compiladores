// Un ejemplo simple de herencia.
// Crear una superclass.
class A {
  int i, j;
  void showij() {
    System.out.println("i y j: " + i + " " + j);
  }
}

// Crear una subclass por extender la class A.
class B extends A {
  int k;

  void showk() {
    System.out.println("k: " + k);
  }

  void sum() {
    System.out.println("i+j+k: " + (i+j+k));
  }
}

class SimpleHerencia {
  public static void main(String args[]) {
    A superOb = new A();
    B subOb = new B();
    // La superclass puede ser usada por si misma.
    superOb.i = 10;
    superOb.j = 20;
    System.out.println("Contenido de superOb: ");
    superOb.showij();
    System.out.println();
    /* La subclase tiene acceso a todos los miembros publicos de
      su superclase. */
    subOb.i = 7;
    subOb.j = 8;
    subOb.k = 9;
    System.out.println("Contenido de subOb: ");
    subOb.showij();
    subOb.showk();
    System.out.println();
    System.out.println("Suma de i, j y k en subOb:");
    subOb.sum();
  }
}


