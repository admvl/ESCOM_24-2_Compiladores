public class LogisticaD {
   public String s;

   private String rastreoInterno(boolean b) {
      if(b) {
         class Rastreos {
            private String id;
            
            Rastreos(String s) {
               id = s;
            }

            String obtenerId() {
               return id;
            }

            String getS() {
               return s;
            } 
         }

         Rastreos ts = new Rastreos("deslizar");
         String s = ts.obtenerId();
         
         
      }
      return getS();
   }

   public String rastrear() {
      return rastreoInterno(true);
   }

   public static void main(String[] args) {
      LogisticaD p = new LogisticaD();
      
      
      
      System.out.println(p.rastrear());
   }
}
