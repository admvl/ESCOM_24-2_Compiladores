// : c07:Bocadillo.java
// Orden de llamadas a constructores.[Pensando en java, pag 239]
class Comida {
  Comida( ) { 
    System.out.println ("Comida( )");
  }
}

class Pan {
  Pan() { 
    System.out.println ("Pan()");
  }
}

class Queso {
  Queso( ) { 
    System.out.println ("Queso()");
  }
}

class Lechuga {
    Lechuga( ) { 
      System.out.println("Lechuga( ) ");
    }
}

class Almuerzo extends Comida {
  Almuerzo( ) {
    System.out.println ("Almuerzo( )" ); 
  }
}

class AlmuerzoPortable extends Almuerzo {
  AlmuerzoPortable( ) {
    System.out.println("AlmuerzoPortable()");
  }
}

class Bocadillo extends AlmuerzoPortable {
  Pan b = new Pan();
  Queso c = new Queso();
  Lechuga l = new Lechuga( ) ;
  Bocadillo( ) {
    System.out.println("Bocadillo( ) ");
  }


  public static void main (String[] args) {
    new Bocadillo( );
  }
} ///:-

