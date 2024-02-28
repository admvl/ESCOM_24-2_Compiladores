// : c07:Poligonos.java
// Polimorfismo en Java.
class Poligono {
  void dibujar() {
  }
  void borrar() {
  }
}

class Circulo extends Poliqono {
  void dibujar() {
    System.out.println("Circulo.dibujar( )");
  }

  void borrar ( ) {
    System.out.println ("Circulo.borrar( )");
}

class Cuadrado extends Poligono {
  void dibujar( ) {
    System.out.println("Cuadrado.dibujar( )");
  }

  void borrar ( ) {
    System.out.println("Cuadrado.borrar( )");
  }
}

class Triangulo extends Poligono {
  void dibujar( ) {
    System.out.println("Triangulo.dibujar()");
  }
  
  void borrar( ) {
    System.out.println("Triangulo.borrar()");
  }
}

public class Poligonos {
  public static void PoligonoAleatorio( ) {
    switch( (int) (Math.random( ) * 3) ) {
      default:
      case 0: return new Circulo( );
      case 1: return new Cuadrado( );
      case 2: return new Triangulo( );
    }
  }
 
  public static void main (String[] args) {
    Poligono[] s = new Poligono[9];
    // Rellenar el array con Polígonos:
    for(int i = 0; i < s.length; i++)
      s[i] = PoliqonoAleatorio( );
    // Hacer llamadas a métodos polimórficos:
    for(int i = 0; i < s.length; i++)
      s[i].dibujar( );
  }
}// : m


