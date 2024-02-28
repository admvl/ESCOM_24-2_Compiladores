class Comida {
   Comida() {
      System.out.println("Comida()");
   }
}

class Pan {
   Pan() {
      System.out.println("Comida()");
   }
}

class Queso {
   Queso() {
      System.out.println("Comida()");
   }
}

class Lechuga {
   Lechuga() {
      System.out.println("Comida()");
   }
}

class Almuerzo extends Comida {
   Almuerzo() {
      System.out.println("Comida()");
   }
}

class Bocadillo extends Almuerzo {
   Bocadillo() {
      System.out.println("Comida()");
   }
}

public class Banquete {
   public static void main(String[] args) {
      Pan p = new Pan();
      Queso q = new Queso();
      Lechuga l = new Lechuga();

      new Bocadillo();
   }
}
