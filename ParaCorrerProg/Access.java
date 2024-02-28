/* En una jerarquía de class, miembros private permanecen
   en su clase.
   
   Este programa contiene un error y no compilará.
*/

// Crea una superclass.
class A {
  int i; // public por default
  private int j; // private de A
  void setij(int x, int y) {
    i = x;
    j = y;
  }
}

// Como j no es accesible aquí.
class B extends A {
  int total;
  void sum() {
  total = i + j; // ERROR, j no es accesible aquí
  }
}

class Access {
  public static void main(String args[]) {
    B subOb = new B();
    subOb.setij(10, 12);
    subOb.sum();
    System.out.println("Total es " + subOb.total);
  }
}



