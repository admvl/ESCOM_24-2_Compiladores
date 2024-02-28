// : c07:Rana.java
// Probando finalize con herencia [Pensando en java, pág 241].

class HacerFinalizacionBase {
  public static boolean indicador = false;
}

class Caracteristica {
  String S;
  Caracteristica(String c) {
    S = c;
    System.out.println("Creando Caracteristica " + S);
  }

  protected void finalize( ) {
    System.out.println("finalizando Caracteristica " + S);
  }
}

class CriaturaViviente {
  Caracteristica p = new Caracteristica("esta vivo");
  CriaturaViviente( ) {
    System.out.println("CriaturaViviente()");
  }

  protected void finalize() throws Throwable {
    System.out.println("Finalizando Criaturaviviente");
    // ;Llamar a la versión de la clase base al FINAL!
    if(HacerFinalizacionBase.indicador)
      super.finalize( );
  }
}

class Animal extends CriaturaViviente {
  Caracteristica p = new Caracteristica("tiene corazon");
  Animal() {
    System.out.println("Animal( )");
  }
  protected void finalize() throws Throwable {
    System.out.println("Finalizando Animal");
    if(HacerFinalizacionBase.indicador)
      super.finalize( );
  }

class Anfibio extends Animal {
  Caracteristica p = new Caracteristica("puede vivir en el agua");
  Anfibio( ) {
    System.out.println("Anfibio( ) " );
  }

  protected void finalize( ) throws Throwable {
    System.out.println("Finalizando Anfibio");
    if(HacerFinalizacionBase.indicador)
      super.finalize( );
  }
}

public class Rana extends Anfibio {
  Rana() {
    System.out.println("Rana( )");
  }

  protected void finalize( ) throws Throwable {
    System.out.println("Fina1izando Rana");
    if(HacerFinalizacionBase.indicador)
      super.finalize( );
  }

  public static void main(String[] args) {
    if (args.length != 0 &&
      args[O].equals("finalizar"))
      HacerFinalizacionBase.indicador = true;
    else
      System.out.println("No finalizando las bases");
    new Rana(); // Se convierte en basura automáticamente
    System.out.println( " iAdi03 ! " );
    // Forzar la invocación de todas las funiciones:
    System.gc();
  }
} ///:-


