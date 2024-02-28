public class RetornoGrados1 {
   public static void imprimirGrados(double medicion) {
      if(medicion < 0 medicion > 100) {
         System.out.println("Medición erronea");
      }

      if(medicion >= 90.0)
         System.out.println('A');
      else if(medicion >= 80.0)
         System.out.println('B');
      else if(medicion >= 70.0)
         System.out.println('C');
      else if(medicion >= 60.0)
         System.out.println('D');
      else
         System.out.println('F');
   }

   public static void main(String[] args) {
      System.out.println("Los grados, son: " + getGrados(78.5));
      System.out.println("Los grados, son: " + getGrados(59.5));
   }
}