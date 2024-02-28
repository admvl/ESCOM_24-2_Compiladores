// Metodo sobreescrito.
class A {
  int i, j;
  
  A(int a, int b) {
    i = a;
    j = b;
  }
 
  // despliega i y j
  void show() {
    System.out.println("i y j: " + i + " " + j);
  }
}

class B extends A {
  int k;
  
  B(int a, int b, int c) {
    super(a, b);
    k = c;
  }

  // despliega k – que sobreescribe en show() en A
  void show() {
    System.out.println("k: " + k);
  }
}

class Sobreescrito {
  public static void main(String args[]) {
    B subOb = new B(1, 2, 3);
    subOb.show(); // Este llama a show() en B
  }
}
