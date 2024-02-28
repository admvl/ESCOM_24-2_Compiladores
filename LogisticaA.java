public class LogisticaA {
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
   
   public Destino para(String s) {
      return new Destino(s);
   }
   
   public Contenido cont() {
      return new Contenido();
   }

   public void enviar(String dest) {
      Contenido c = cont();
      Destino d = para(dest);
         
      System.out.println(d.leerEtiqueta());
   }

   public static void main(String[] args) {
      LogisticaA p = new LogisticaA();
      LogisticaA q = new LogisticaA();
      
      System.out.println();

      p.enviar("Ciudad de México");
       
      LogisticaA.Contenido c = q.cont();
      LogisticaA.Destino d = q.para("Veracruz");
      
      System.out.println();
      
      System.out.println(d.leerEtiqueta());
   }
}
