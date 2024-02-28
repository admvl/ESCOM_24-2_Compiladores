interface A {
  void metodo1();
  void metodo2();
}

interface B extends A {
  void metodo3();
}

class MiClase implements B {
  public void metodo1() {
    System.out.println("Implementa el metodo1().");
  }
  
  public void metodo2() {
    System.out.println("Implementa el metodo2().");
  }

  public void metodo3() {
    System.out.println("Implementa el metodo3().");
  }

}

class IFExtend {
  public static void main(String arg[]) {
    MiClase ob = new MiClase();
    ob.metodo1();
    ob.metodo2();
    ob.metodo3();
  }
}
