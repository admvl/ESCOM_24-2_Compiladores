class Animal2 {
  String a1;
  
  void comer() {
    System.out.println("EL " + a1 + " come croquetas");
  }
  
  public static void main(String args[]) {
    Animal perro = new Animal();
    perro.a1 = "perro";
    
    perro.comer();
  }
}
