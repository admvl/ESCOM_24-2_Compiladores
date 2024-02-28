public class AutoB {
   private String marca;
   private int anio;
   private String color;

   public AutoB(String marca, int anio, String color) {
      this.marca = marca;
      this.anio = anio;
      this.color = color;
   }

   public boolean equals(AutoB unAuto) {
      return color.equals(unAuto.color);
   }

   public boolean esMismoColor(AutoB unAuto) {
       return color.equals(unAuto.color);
   }
   
   public static void main(String[] args) {
      AutoB c1 = new AutoB("Honda", 2008, "rojo");
      AutoB c2 = c1;
      AutoB c3 = new AutoB("Vocho", 2007, "azul");
      
      System.out.println(c2 == c1);
      System.out.println(c2.equals(c3));
      
      if(c1.esMismoColor(c3))
         System.out.println("Tienen el mismo color");
      else
         System.out.println("No tienen el mismo color");
   }
}
