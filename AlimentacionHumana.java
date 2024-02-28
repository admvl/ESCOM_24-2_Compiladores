class Alimentacion {
   public Alimentacion() {
      System.out.println("\nTomar los alimentos");
   }
}

class Cafe {
   public Cafe() {
      System.out.println("Servir una taza de café");
   }
}

class Desayuno extends Alimentacion {
   Cafe c = new Cafe();
   
   public Desayuno() {
      System.out.println("Comenzar a desayunar");
   }
}

public class AlimentacionHumana {
   public static void main(String[] args) {
      new Desayuno();
   }
}
