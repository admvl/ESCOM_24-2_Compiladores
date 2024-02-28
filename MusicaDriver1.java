class Instrumento {
  public void tocar() {
    System.out.println("Instrumento.tocar()");
  }
  
  public String queInstrumento() {
    return "Instrumento";
  }
  
  public void afinar() {
    //return System.out.println("afino el instrumento");
  }
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

public class MusicaDriver1 {
  static void armonizar(Instrumento i) {
    i.tocar();
  }
  
  static void armonizarOrquesta(Instrumento[] or) {
    for(int i = 0; i < or.length; i++)
      armonizar(or[i]);  
  }
  
  public static void main(String args[]) {
    Instrumento[] orquesta = new Instrumento[5];
    int i = 0;
    
    orquesta[i++] = new Viento();
    orquesta[i++] = new Metal();
    orquesta[i++] = new Madera();
    orquesta[i++] = new Percusion();
    orquesta[i++] = new Cuerda();
        
    armonizarOrquesta(orquesta);
  }
}
