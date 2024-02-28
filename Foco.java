public class Foco {
   public boolean brillo;
   
   public void setBrillo(boolean brillo) {
       this.brillo = brillo;
   }
   
   public boolean getBrillo() {
      return brillo;
   }
   
   public boolean esBrillozo() {
      return brillo;
      
   }
   
   public static void main(String[] args) {
      Foco f = new Foco();
      
      f.setBrillo(true);
      System.out.println("El foco, esta : " + f.getBrillo());
      
   }
}
   
   
