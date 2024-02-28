class Animal {
  static String a1;
  
  void comer() {
    System.out.println("EL " + a1 + " come croquetas");
  }
  
  public static void main(String args[]) {
    Animal perro = new Animal();
    a1 = "perro";
    
    perro.comer();
  }
}
