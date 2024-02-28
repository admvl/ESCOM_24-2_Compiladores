// : c08:musica5:Musica5.java
// Interfaces [Pensando en java, pág 256].
import java.util.*;

interface Instrumento {
  // Tiempo de compilación constante:
  int i = 5; // estático y constante
  // No puede tener definiciones de métodos:
  void tocar( ); // Automáticamente public
  String que( );
  void ajustar( );
}

class Viento implements Instrumento {
  public void tocar( ) {
    System.out.println("Viento.tocar ( ) " );
  }

  public String que() { 
    return "Viento";
  }

  public void ajustar( ) {
  }
}

class Percusion implements Instrumento {
  public void tocar( ) {
    System.out.println("Percusion.tocar()");
  }

  public String que() { 
    return "Percusion";
  }

  public void ajustar( ) {
 }
}

class Cuerda implements Instrumento {
  public void tocar( ) {
    System.out.println ("Cuerda.tocar( )");
  }

  public Cuerda que() { 
    return "Cuerda";
  }

  public void ajustar( ) { 
  }

class Metal extends Viento {
  public void tocar( ) {
    System.out.println ("Metal.tocar( )") ;
  }

  public void ajustar( ) {
    System.out.println ("Metal.ajustar()") ;
}

class Maderaviento extends Viento {
  public void tocar( ) {
    System.out.println("Maderaviento.tocar()");
  }

  public String que() {
    return "Maderaviento";
  }

public class Musica5 {
  // No le importa el tipo por lo que los nuevos
  // tipos que se aniadan al sistema seguirán funcionando bien:
  static void afinar(Instrumento i) {
  // ---
  i.tocar();
  }

  static void afinarTodo(Instrumento[] e) {
    for(int i = 0; i < e.length; i++)
      afinar(e[i]);
  }

  public static void main(String[] args) {
    Instrumento[] orquesta = new Instrumento[5];
    int i = 0;
    // Haciendo conversión hacia arriba durante la inserción en el array:
    orquesta[i++] = new Viento();
    orquesta[i++] = new Percusion( );
    orquesta[i++] = new Cuerda(); 
    orquesta[i++] = new Metal();
    orquesta[i++] = new Maderaviento( );
    afinarTodo(orquesta);
  }
}



