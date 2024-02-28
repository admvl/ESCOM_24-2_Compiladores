// : c07:musica:Musica.java
// Herencia y conversión hacia arriba.
class Nota {
  private int valor;
  private Nota(int val) { 
    valor = val;
  }
  public static final Nota
    DO_MAYOR = new Nota(0),
    DO_SOSTENIDO = new Nota(1) ,

    SI_BEMOL = new Nota(2);
} // Etc.

class Instrumento {
  public void tocar(Nota n) {
    System.out.println("Instrumento.tocar( ) ");
  }
}

// Los objetos de viento son instrumentos
// dado que tienen la misma interfaz:
class Viento extends Instrumento {
  // Redefinir el metodo interfaz:
  public void tocar(Nota n) {
    System.out.println("Viento.tocar( ) ");
  }
}

public class Musica {
  public static void afinar(Instrumento i) {
  // ...
  i.tocar(Nota.DO_SOSTENIDO);
  }

  public static void main(String[] args) {
    Viento flauta = new Viento( );
    afinar(flauta); // Conversión hacia arriba
  }
} ///:-

