interface Destino {
   String leerEtiqueta();
}

interface Contenido {
   int valor();
}

class LogisticaB {
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
   
public class LogisticaBprincipal {
   public static void main(String[] args) { 
      LogisticaB p = new LogisticaB();
      
      Contenido c = p.cont();
      //PaDestino d = p.dest("Pachuca");
      LogisticaB.PaContenido pc = p.new PaContenido();
      p.dest("Texcoco");
      System.out.println(c.valor());
   }
}
      
      
