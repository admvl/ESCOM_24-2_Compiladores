public class Logistica {
   class Contenido {
      private int i = 11;
      
      public int cantidad() {
         return i;
      }
   }

   class Destino {
      private String etiqueta;
      
      Destino(String aDonde) {
         etiqueta = aDonde;
      }

      String leerEtiqueta() {
         return etiqueta;
      }
   }

   public void enviar(String dest) {
      //Contenido c = new Contenido();
      Destino d = new Destino(dest);
         
      System.out.println(d.leerEtiqueta());
   }

   public static void main(String[] args) {
      Logistica p = new Logistica();
      Logistica.Destino e = p.new Destino("Puebla");
      
      System.out.println();

      p.enviar("Ciudad de México");
      System.out.println(e.leerEtiqueta());
     
   }
}
