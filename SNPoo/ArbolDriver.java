class Arbol {
  int altura;
  
  Arbol() {
    visualizar ("Plantando un retoño");
    altura = 0;
  }
  
  Arbol(int i) {
    visualizar("Creando un nuevo arbol que tiene "
    + i + " metros de alto");
    altura = i;
  }
  
  void info() {
    visualizar("E1 arbol tiene " + altura
    + " metros de alto");
  }
  
  void info(String s) {
    visualizar(s + " : El arbol tiene "
     + altura + " metros de alto");
  }
  
  static void visualizar(String s) {
    System.out.println(s);
  }
}

public class ArbolDriver {
    public static void main(String[] args) {

      for(int i = 0; i < 11; i++) {
        Arbol t = new Arbol(i);
        t.info();
        t.info("metodo sobrecargado");
      } // Constructor sobrecargado:
      //new Arbol();
      System.out.println(" cuando comienza a dar duraznos.");
    }
}

