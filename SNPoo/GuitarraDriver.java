class Instrumento {
    String instrumento;
    String nota;
           
    public void setInstrumento(String instrumento) {
        this.instrumento = instrumento;
    }
           
    public void tocar() {
        System.out.println("Tocar la/el ");
    }
           
    public String getInstrumento() {
        return instrumento;
    }
           
    public void afinar() {
        System.out.println("afinar");
    }
}

public class GuitarraDriver {
    public static void main(String[] args) {
        Instrumento cuerda = new Instrumento();
        
        cuerda.setInstrumento("guitarra");
        cuerda.tocar();
        System.out.println(cuerda.getInstrumento());
    }
}
