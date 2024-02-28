public class Faculty extends Employee {
  public static void main(String[] args) {
    new Faculty();
  }
  
  public Faculty() {
    System.out.println("(4) realiza la tarea de Faculty");
  }
}

class Employee extends Person {
  public Employee() {
    this("(2) Invoca el constructor sobrecargado de Employee");
    System.out.println("(3) Realiza la tarea del Employee");
  }

  public Employee(String s) {
    System.out.println(s);
  }
}

class Person {
  public Person() {
    System.out.println("(1) Realiza la tarea de Person");
  }
}
