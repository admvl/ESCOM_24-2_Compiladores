class EstadoCuerpoHumano {
   private static final double TEMP_NORMAL = 36;
   private double tempActual;
   
   public EstadoCuerpoHumano(double tempActual) {
      this.tempActual = tempActual;
   }
   
   public boolean esAlta() {
      return Math.abs(tempActual - TEMP_NORMAL) > 2;
   }
   
   public void diagnostico() {
      if((tempActual - TEMP_NORMAL) > 5) 
         System.out.println("Ir a emergencia");
      else 
         System.out.println("Temperatura normal");
      
   }

}

public class TemperaturaCuerpoHumano {
   public static void main(String[] argas) {
      EstadoCuerpoHumano cuerpo = new EstadoCuerpoHumano(40);

      cuerpo.diagnostico();
      System.out.println(cuerpo.esAlta());
   }
}
