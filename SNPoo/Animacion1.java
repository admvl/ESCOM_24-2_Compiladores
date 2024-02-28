class Arte {
  Arte() {
    System.out.println("Constructor de Arte");
  }
}

class Dibujo extends Arte {
  Dibujo() {
    System.out.println("Costructor de Dibujo");
  }
}

public class Animacion1 extends Dibujo {
  Animacion1() {
    System.out.println("Constructor de Animacion1");
  }
  
  public static void main(String[] args) {
    Animacion1 x = new Animacion1();
  }
}
