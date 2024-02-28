class Pajaro {
  int i;
  
  public void setNumero(int numero) {
    i = numero;
  }
  
  public int getNumero() {
    return i;
  }
}

public class ConstructorPorDefecto {
  public static void main(String[] args) {
    Pajaro nc = new Pajaro(); // ¡por defecto!
    nc.setNumero(5);
    System.out.println("El grupo de pajaros consta de " + nc.i + " elementos");
  }
}
