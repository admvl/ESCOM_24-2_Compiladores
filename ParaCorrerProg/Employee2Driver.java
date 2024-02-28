public class Employee2Driver {
  public static void main(String[] args) {
    Employee2 waitress = new Employee2("Wen-Jung Hsin");
    Employee2 hostess = new Employee2();
    hostess.readName();
  } // end main
} // end class Employee2Driver

public abstract class Employee2 {
  public abstract double getPay();
  private String name;

  //**************************
  public Employee2(String name) {
    this.name = name;
  }

  //**************************
  public void printPay(int date) {
    System.out.printf("%2d %10s: %8.2f\n",
    date, name, getPay());
  } // end printPay
} // end class Employee2

