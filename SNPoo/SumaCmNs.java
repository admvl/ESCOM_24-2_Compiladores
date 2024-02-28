public class SumaCmNs {
  public int sumaCmNs(int i1, int i2) {
    int sum = 0;
   
    for (int i = i1; i <= i2; i++)
      sum += i;
     
    return sum;
  }

   public static void main(String[] args) {
     SumaCmNs s1 = new SumaCmNs();
     
     System.out.println("La suma de 1 a 10 es " + s1.sumaCmNs(1, 10));
     System.out.println("La suma de 20 a 30 es " + s1.sumaCmNs(20, 30));
     System.out.println("La suma de 35 a 45 es " + s1.sumaCmNs(35, 45));
   }
 }
