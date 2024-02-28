interface Destino{
   String leerEtiqueta();
}

interface Contenido {
   int cantidad();
}

public class Logistica2 {
   public Destino dest(String s) {
      class PaDestino implements Destino {
         private String etiqueta;
         
         private PaDestino(String aDonde) {
            etiqueta = aDonde;
         }
         
         public String leerEtiqueta() {
            return etiqueta;
         }
      }

      return new PaDestino(s);
   }

   public static void main(String[] args) {
      Logistica2 p = new Logistica2();
      Destino d = p.dest("Puebla");
      
      System.out.println(d.leerEtiqueta());      
   }
   
}
