class Villano {
  private int i;
  
  public Villano(int ii) {
    i = ii;
  }
  
  protected void poner(int ii) {
    i = ii;
  }
  
  protected int leer() {
    return i;
  }
  
  public int valor(int m) {
    return m * i;
  }
}

class Malvado extends Villano {
  private int j;
  
  public Malvado(int ii) {
    super(ii);
    j = ii;
  }
  
  public void cambiar(int x) {
    
    poner(x);
  }
}

public class VillanoDriver {
  public static void main(String args[]) {
    Malvado m1 = new Malvado(10);
    System.out.println("El valor de i, es: " + m1.leer());
    
    Villano v1 = new Villano(10);
    System.out.println("La multiplicación, es: " + v1.valor(4));
  }
}
