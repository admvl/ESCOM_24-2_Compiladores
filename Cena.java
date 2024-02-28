class Comida {
  public Comida() {
    System.out.println("Constructor de comida ");
  }
  
  void sentarteAcomer() {
    System.out.println("Pedir tu comida ");
  }
}

class Galleta {
  public Galleta() {
    System.out.println("Constructor de Galleta");
  }
  
  void morder() {
    System.out.println("Comer galleta y beber te");
  }
}

public class Cena {
  public Cena() {
  System.out.println("Constructor cena");
  }
  
  public static void main(String[] args) {
    Galleta x = new Galleta();
    Comida p = new Comida();
    
    x.morder();
    p.sentarteAcomer();
  }
}
