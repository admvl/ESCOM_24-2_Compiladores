class PajaroR {
   String color;
          
   PajaroR(String color) {
      this.color = color;
   }

   String getColor() {
      return color;
   }

   public static void main(String[] args) {
      PajaroR p1 = new PajaroR("azul");
      PajaroR p2 = new PajaroR("rojo");

      System.out.println("Hay pajaros de color " + p1.getColor() 
               + " y " + p2.getColor());
   }
}
