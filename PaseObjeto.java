class Prueba {
   int a, b;
   Prueba(int i, int j) {
      a = i;
      b = j;
   }
   
   boolean equals(Prueba o) {
      if(o.a == a && o.b == b)
         return true;
      else
         return false;
   }
}
   
public class PaseObjeto {
   public static void main(String[] args) {
      Prueba o1 = new Prueba(100, 22);
      Prueba o2 = new Prueba(100, 2);
      Prueba o3 = new Prueba(-1, -1);
      
      System.out.println("o1 == o2: " + o1.equals(o2));
      System.out.println("o1 == o3 " + o1.equals(o3));
   }
}
