class Animal1 {
  static String a1;
  
   void comer() {
    System.out.println("EL " + a1 + " come croquetas");
  }
  
  public static void main(String args[]) {
    Animal1 perro = new Animal1();
    a1 = "perro llamado SoloVino";
    
    perro.comer();
  }
}
