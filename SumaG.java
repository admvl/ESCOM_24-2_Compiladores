public class SumaG {
    private int a;
    private int b;
    private int suma;

    public int getSuma(int i1, int i2) {
       int suma = 0;
          
       for (int i = i1; i <= i2; i++)
        suma += i;
       
       return suma;
    }

   public String toString() {
      return "Para el intervalo, de: " ;
   }

    public static void main(String[] args) {
       SumaG sum = new SumaG();
       SumaG sum1 = new SumaG();

       String mensaje1 = "1 a 10 = ";
       String mensaje2 = "20 a 30 = ";
       String mensaje3 = "35 a 45 = ";
              
       System.out.println(sum1.toString() + mensaje1 + sum.getSuma(1,10));
       System.out.println(sum.toString() + mensaje2 + sum.getSuma(20,30));
       System.out.println(sum.toString() + mensaje3 + sum.getSuma(35,45));
              
    }
}
