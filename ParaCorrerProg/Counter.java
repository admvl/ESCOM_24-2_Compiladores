public class Counter {
  private int count;

  //*********************************
  public Counter(int count) {
    this.count = count;
  } // fin constructor

  //*********************************
  public String toString() {
    return Integer.toString(count);
  } // fin toString

  //*********************************
  public static void main(String[] args) {
    Counter counter = new Counter(100);
    String message = "Contador actual = " + counter;
    System.out.println(message);
  } // fin main
} // fin class Counter
