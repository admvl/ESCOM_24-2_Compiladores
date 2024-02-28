public class RetornoGrados {
   public static char getGrados(double medicion) {
      if(medicion >= 90.0)
         return 'A';
      else if(medicion >= 80.0)
         return 'B';
      else if(medicion >= 70.0)
         return 'C';
      else if(medicion >= 60.0)
         return 'D';
      else
         return 'F';
   }

   public static void main(String[] args) {
      System.out.println("Los grados, son: " + getGrados(78.5));
      System.out.println("Los grados, son: " + getGrados(59.5));
   }
}