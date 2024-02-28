class EstadoCuerpoHumano {
   private static final double TEMP_NORMAL = 36;
   private double tempActual;
   
   public boolean esAlta() {
      return Math.abs(tempActual - TEMP_NORMAL) > 2;
   }
   
   public void diagnostico(double tempActual) {
      if((tempActual - TEMP_NORMAL) > 5) 
         System.out.println("Ir a emergencia");
      else 
         System.out.println("Temperatura normal");
      
   }

}

public class TemperaturaCuerpoHumano1 {
   public static void main(String[] argas) {
      EstadoCuerpoHumano cuerpo = new EstadoCuerpoHumano();

      cuerpo.diagnostico(40);
      System.out.println(cuerpo.esAlta());
   }
}
