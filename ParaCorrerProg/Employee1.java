import java.util.Scanner;

public class Employee1 {
  private String name;
  //******************
  public void readName() {
    Scanner stdIn = new Scanner(System.in);
    System.out.print("Name: ");
    this.name = stdIn.nextLine();
  } // end readName
} // end class Employee
