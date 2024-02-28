// Demuestra cuando un constructor son llamados.
// Crea una superclase.
class A {
  A() {
  System.out.println("Dentro del constructor A.");
  }
}

// Crea una subclass para extender la class A.
class B extends A {
  B() {
    System.out.println("Dentro del constructor B.");
  }
}

// Crea otra subclass para extender B.
class C extends B {
  C() {
    System.out.println("dentro del constructor C.");
  }
}

class CallingCons {
  public static void main(String args[]) {
    C c = new C();
  }
}
