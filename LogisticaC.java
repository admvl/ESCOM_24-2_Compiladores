/*public class Envoltura {
   private int i;

   public Envoltura(int x) {
      i = x;
   }

   public int valor() {
      return i;
   }
}*/

interface Destino {
   String leerEtiqueta();
}

public class LogisticaC {
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
      LogisticaC p = new LogisticaC();
      Destino d = p.dest("Tampico");

      System.out.println();

      System.out.println(d.leerEtiqueta());
   }
}
