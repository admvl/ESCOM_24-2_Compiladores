class Juego {
  Juego(int i) {
    System.out.println("Constructor de Juego");
  }
}

class JuegoMesa extends Juego {
  JuegoMesa(int i) {
    super(i);
    System.out.println("Constructor de JuegoMesa");
  }
}

public class Ajedrez1 extends JuegoMesa {
  Ajedrez1() {
    super(11);
    System.out.println("Constructor de Ajedrez1");
  }
  
  public static void main(String[] args) {
    Ajedrez1 x = new Ajedrez1();
  }
}
