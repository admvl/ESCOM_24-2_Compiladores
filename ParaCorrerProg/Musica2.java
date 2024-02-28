// : c07:musica2:Musica2.java
// Sobrecarga en vez de conversión hacia arriba.

class Nota {
  private int valor;
  private Nota(int val) { 
    valor = val;
  }
    public static final Nota
      DO_MAYOR = new Nota(0),
      DO_SOSTENIDO = new Nota(1),
      SI_BEMOL = new Nota(2);
} // Etc.

class Instrumento {
  public void tocar(Nota n) {
  System.out.println("Instrumento.tocar()");
  }
}

class Viento extends Instrumento {
  public void tocar(Nota n) {
  System.out.println("Viento.tocar() ");
  }
}

class Cuerda extends Instrumento {
  public void tocar(Nota n) {
    System.out.println("Cuerda.tocar() ");
  }
}

class Metal extends Instrumento {
  public void tocar (Nota n) {
    System.out.println("Metal.tocar()");
  }
}

public class Musica2 {
  public static void afinar(Viento i) {
    i.tocar(Nota.DO_MAYOR);
  }

  public static void afinar(Cuerda i) {
    i.tocar(Nota.DO_MAYOR);
  }

  public static void afinar(Metal i) {
    i.tocar(Nota.DO_MAYOR);
  }

  public static void main (String[] args) {
    Viento flauta = new Viento();
    Cuerda violin = new Cuerda();
    Metal trompeta = new Metal();
    afinar(flauta); // Sin conversión hacia arriba
    afinar(violin);
    afinar(trompeta);
  }
} ///:-

