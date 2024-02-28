class Animal {
  static String a1;
  
  void comer() {
    System.out.println("EL " + a1 + " come croquetas");
  }
}

public class AnimalCome {  
  public static void main(String args[]) {
    Animal perro = new Animal();
    Animal.a1 = "perro";
    
    perro.comer();
  }
}
