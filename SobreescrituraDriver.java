class A {
  int i, j;
 
  A(int a, int b) {
    i = a;
    j = b;
  }
 
  void mostrar() {
    System.out.println("i y j " + i + " " + j);
  }
}
 
class B extends A {
  int k;
  
  B(int a, int b, int c) {
    super(a, b);
    k = c;
  }
  
  void mostrar(String m) {
    System.out.println(m + k);
  }
}

class SobreescrituraDriver {
  public static void main(String args[]) {
    B subO = new B(15, 43, 8);
    
    subO.mostrar("Esto es k: ");
    subO.mostrar();
  }
}
