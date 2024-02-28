// : c08:Aventura.java
// Múltiples interfaces [Pensando en java, pág 259].
import java.util. *;

interface PuedeLuchar {
  void luchar( );
}

interface PuedeNadar {
  void nadar( );
}

interface PuedeVolar {
  void volar( );
}

class PersonajeDeAccion {
  public void luchar( ){
    System.out.println("Lucha bien " );
  }
}

class Heroe extends PersonajeDeAccion
  implements PuedeLuchar, PuedeNadar, PuedeVolar {
    public void nadar() {
    }

    public void volar() {
    }
}
    
public class Aventura {
  static void t(PuedeLuchar x) { 
    x.luchar( ); 
  }

  static void u(PuedeNadar x) { 
    x.nadar( ); 
  }

  static void v(PuedeVolar x) { 
    x.volar( ); 
  }

  static void w(PersonajeDeAccion x) { 
    x.luchar( );
  }

  public static void main(String[] args) {
    Heroe h = new Heroe( );
    t(h); // Tratarlo como un PuedeLuchar
    u(h); // Tratarlo como un PuedeNadar
    v(h); // Tratarlo como un PuedeVolar
    w(h); // Tratarlo como un PersonajeDeAccion
  }
}





