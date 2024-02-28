abstract class Instrumento {
  int n;
  
  public abstract void tocar();
  
  public String queInstrumento() {
    return "Instrumento";
  }
  
  public abstract void afinar();
}

class Viento extends Instrumento {
  public void tocar() {
    System.out.println("Viento.tocar()");
  }
  
  public String queInstrumento() {
    return "Viento";
  }
  
  public void afinar() {
  
  }

}

class Cuerda extends Instrumento {
  public void tocar() {
    System.out.println("Cuerda.tocar()");
  }
  
  public String queInstrumento() {
    return "Cuerda";
  }
  
  public void afinar() {
  
  }
}

class Percusion extends Instrumento {
  public void tocar() {
    System.out.println("Percusion.tocar()");
  }
  
  public String queInstrumento() {
    return "Percusión";
  }
  
  public void afinar() {
  
  }
}

class Madera extends Viento {
  public void tocar() {
    System.out.println("VientoMadera.tocar()");
  }
  
  public String queInstrumento() {
    return "Viento madera";
  }
  
  public void afinar() {
  
  }
}

class Metal extends Viento {
  public void tocar() {
    System.out.println("VientoMetal.tocar()");
  }
  
  public String queInstrumento() {
    return "Viento metal";
  }
  
  public void afinar() {
  
  }
}

class Nota {
  public static final int SOL = 0, DO = 1, RE = 2, MI = 3, LA = 4;
}

public class InterfaceInstrumento {
  static void armonizar(Instrumento i) {
    i.tocar();
  }
  
  static void armonizarOrquesta(Instrumento[] or) {
    for(int n = 0; n < or.length; n++)
      armonizar(or[n]);  
  }
  
  public static void main(String args[]) {
    Instrumento[] orquesta = new Instrumento[5];
    int n = 0;
    
    orquesta[n++] = new Viento();
    orquesta[n++] = new Metal();
    orquesta[n++] = new Madera();
    orquesta[n++] = new Percusion();
    orquesta[n++] = new Cuerda();
        
    armonizarOrquesta(orquesta);
  }
}
