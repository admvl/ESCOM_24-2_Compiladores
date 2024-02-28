public class Libro {
  public String titulo;
  public int porcentajeLeido;
  
  public void listaLibrosLeidos(String titulo, int porcentajeLeido) {
    this.titulo = titulo;
    this.porcentajeLeido = porcentajeLeido;
  }
  
  public boolean esLeido() {
    if(porcentajeLeido == 100) {
      return true;
    }
    else {
      return false;
    }
  }
  
  public static void main(String[] args) {
    Libro novela = new Libro();
    novela.listaLibrosLeidos("Los de abajo", 100);
    
    Libro filosofia = new Libro();
    filosofia.listaLibrosLeidos("Los dialogos de Platón", 40);
    
    if(novela.esLeido()) {
      System.out.println("Ya lo leí");
    }
    else {
      System.out.println("No lo he leido");
    }
    
    if(filosofia.esLeido()) {
      System.out.println("Ya lo leí");
    }
    else {
      System.out.println("No lo he leido");
    } 
  }
}
