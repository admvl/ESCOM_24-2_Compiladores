public class SumaCc {
  int sum = 0;
  
  public SumaCc(int i1, int i2) {
       
    for (int i = i1; i <= i2; i++)
      sum += i;
     
  }
  
  public int getSuma() {
    return sum;
  }

  public static void main(String[] args) {
    SumaCc sum1 = new SumaCc(1,10);
    SumaCc sum2 = new SumaCc(20,30);
    SumaCc sum3 = new SumaCc(35,45);
     
    System.out.println(sum1.getSuma());
    System.out.println(sum2.getSuma());
    System.out.println(sum3.getSuma());
  }
}
