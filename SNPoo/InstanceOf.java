class A {
   int i, j;
}

class B {
   int i, j;
}

class C extends A {
   int k;
}

class D extends A {
   int k;
}

class InstanceOf {
   public static void main(String args[]) {
      A a = new A();
      B b = new B();
      C c = new C();
      D d = new D();
      
      if(a instanceof A)
         System.out.println("a es una instancia de A");
      if(b instanceof B)
         System.out.println("b es una instancia de B");
      if(c instanceof C)
         System.out.println("c es una instancia de C");
      if(c instanceof A)
         System.out.println("c puede ser cast para A");

      
      if(a instanceof C)
         System.out.println("a puede ser cast para C");
      
      System.out.println();
      
      // se comparan tipos de tipos derivados
      A ob;

      ob = d; // Una referencia a d
      System.out.println("ob ahora se refiere a d");
      if(ob instanceof D)
         System.out.println("ob es una instancia de D");
         
      System.out.println();
      
      ob = c; // Una referencia a c
      System.out.println("ob ahora se refiere a c");
      
      if(ob instanceof D)
         System.out.println("ob puede ser cast para D");
      else
         System.out.println("ob puede no ser cast para D");
         
      if(ob instanceof A)
         System.out.println("ob puede ser cast para A");
      
      System.out.println();
      
      // todos los objetos pueden ser cast para Object
      if(a instanceof Object)
         System.out.println("a puede ser cast para Object");
      if(b instanceof Object)
         System.out.println("b puede ser cast para Object");
      if(c instanceof Object)
         System.out.println("c puede ser cast para Object");
      if(d instanceof Object)
         System.out.println("d puede ser cast para Object");
   }
}

// La salida del programa es:

//    a es una instancia de A
//    b es una instancia de B
//    c es una instancia de C
//    c puede ser cast para A

//    ob ahora se refiere a d
//    ob es una instancia de D

//    ob ahora se refiere a c
//    ob puede no ser cast para D
//    ob puede ser cast para A

//    a puede ser cast para Object
//    b puede ser cast para Object
//    c puede ser cast para Object
//    d puede ser cast para Object
