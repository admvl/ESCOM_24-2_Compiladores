public class ObjetoGeometrico {
    private String color = "blanco";
    private boolean relleno;
    private java.util.Date dato;
    
    public ObjetoGeometrico() {
       dato = new java.util.Date();
    }

    public ObjetoGeometrico(String color, boolean relleno) {
       dato = new java.util.Date();
       this.color = color;
       this.relleno = relleno;
    }
    
    public String getColor() {
       return color;
    }

    public void setColor(String color) {
       this.color = color;
    }

    public boolean esRelleno() {
       return relleno;
    }

    public void setRelleno(boolean relleno) {
       this.relleno = relleno;
    }

    public java.util.Date getDato() {
       return dato;
    }

    public String toString() {
       return "Dato creado " + dato + "\ncolor " + color + 
        " y el relleno, es " + relleno;
    }
   
    public static void main(String[] args) {
       ObjetoGeometrico og = new ObjetoGeometrico("rojo", false);
       
       if(!og.esRelleno())
          System.out.println("La figura geométrica esta coloreada ");

       System.out.println("La información, es: " 
        + og.toString());
       
    }
}
