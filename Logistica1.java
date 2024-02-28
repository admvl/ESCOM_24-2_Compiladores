interface Destino{
   String leerEtiqueta();
}

interface Contenido {
   int cantidad();
}

class Logistica1 {
   private class PaContenido implements Contenido {
      private int i = 11;
      
      public int cantidad() {
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

   public PaDestino para(String s) {
       return new PaDestino(s);
   }

   public PaContenido cont() {
      return new PaContenido();
   }

   public void enviar(String dest) {
      Contenido c = cont();
      Destino d = para(dest);
         
      System.out.println(d.leerEtiqueta());
   }

   public static void main(String[] args) {
      Logistica1 p = new Logistica1();

      PaContenido c = p.cont();
      //PaDestino d = p.enviar("Texcoco");
      Logistica1.PaContenido pc = p.new PaContenido();
      p.enviar("Texcoco");
      System.out.println(c.cantidad());
      System.out.println(pc.cantidad());
            
   }
}
