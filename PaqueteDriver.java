interface Destino {
   String leerEtiqueta();
}

interface Contenido {
   String valor();
}

class Logistica2 {
   private class PaContenido implements Contenido {
      private int i = 11;
      
      public int valor() {
         return i;
      }
   }

   protected class PaDestino implements Destino {
      private String etiqueta;
      private PaDestino(String aDonde) {
         etiqueta = aDonde;
      }

      public String leerEtiqueta() {
         return etiqueta;
      }
   }

   public Destino dest(String s) {
      return new PaDestino(s);
   }

   public Contenido cont() {
      return new PaContenido();
   }
}

public class PaqueteDriver {
   public static void main(String[] args) {
      Logistica2 p = new Logistica2();
      Contenido c = p.cont();
      Destino d = p.dest("Tulancingo");
   }
}
