public class SerVivoR1 {
   String ser;

   public void setSer(String ser) {
      this.ser = ser;
   }
   
   public boolean equals(SerVivoR1 o) {
      return ser.equals(o.ser);
   }   

   public static void main(String[] args) {
      SerVivoR1 animal = new SerVivoR1();
      SerVivoR1 vegetal = new SerVivoR1();

      animal.setSer("venado");
      vegetal.setSer("lechuga");

      if(animal.equals(vegetal))
         System.out.println("Son del mismo reino.");
      else
         System.out.println("La lechuga no es un venado.");
   }
}
    
