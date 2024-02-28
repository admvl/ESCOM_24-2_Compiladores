//import java.util.*;

interface Instrumento {
  //int i = 0;

  void tocar();
  String queInstrumento();
  void afinar();
}

class Viento implements Instrumento {
  public void tocar() {
    System.out.println("Viento.tocar(Do)");
  }

  public String queInstrumento() { 
    return "Viento";
  }

  public void afinar() {
 
  }
}

class Percusion implements Instrumento {
  public void tocar() {
    System.out.println("Percusion.tocar(Re)");
  }

  public String queInstrumento() { 
    return "Percusion";
  }

  public void afinar() {
  }
}

class Cuerda implements Instrumento {
    public void tocar() {
      System.out.println("Cuerda.tocar(Mi)");
    }

    public String queInstrumento() { 
      return "Cuerda";
    }

    public void afinar() {

    }
}

class Metal extends Viento {
    public void tocar() {
      System.out.println ("VientoMetal.tocar(Fa)");
    }

    public void afinar() {
      System.out.println ("VientoMetal.afinar()");
    }
}

class Madera extends Viento {
    public void tocar( ) {
        System.out.println("VientoMadera.tocar(Sol)");
    }

    public String queInstrumento() {
        return "Viento madera";
    }
}

public class MusicaDriver {
  static void armonizar(Instrumento i) {
    i.tocar();
  }

  static void armonizarOrquesta(Instrumento[] or) {
    for(int i = 0; i < or.length; i++)
      armonizar(or[i]);
  }

  public static void main(String[] args) {
    Instrumento[] orquesta = new Instrumento[5];
    int n = 0;
    
    System.out.println();

    orquesta[n++] = new Viento();
    orquesta[n++] = new Percusion();
    orquesta[n++] = new Cuerda();
    orquesta[n++] = new Metal();
    orquesta[n++] = new Madera();

    armonizarOrquesta(orquesta);
  }
} 

