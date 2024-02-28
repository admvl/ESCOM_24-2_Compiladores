public class Ratoncito {
  public String nombre;
  public int edad;
  public int peso;
  public double prciento crecimiento;
  
  public void setNombre(String nombre) {
    this.nombre = nombre;
  }
  
  public boolean esSuNombre() {
    if(this.nombre == "speedy") {
      return true;
    }
    else {
      return false;
    }
  }
  
  public static void main(String[] args) {
    Ratoncito raton = new Ratoncito();
    raton.setNombre("speedy");
    
    if(!raton.esSuNombre()) {
      System.out.println("Es su nombre");
    }
    else {
      System.out.println("No es su nombre");
    }
  }
}
  
  
