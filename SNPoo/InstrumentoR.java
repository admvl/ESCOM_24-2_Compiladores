public class InstrumentoR {
        public String instrumento;
        
        public void setInstrumento(String instrumento) {
           this.instrumento = instrumento;
        }

        public String getInstrumento() {
            return instrumento;
        }
        
        public void tocar() {
          System.out.println("toca la ");
        }

        public String toString() {
           return "El músico " ;
        }
        
        public static void main(String[] args) {
           InstrumentoR cuerda = new InstrumentoR();
           
           cuerda.setInstrumento("guitarra");
           
           System.out.println(cuerda.toString());
           cuerda.tocar();
           System.out.println(cuerda.getInstrumento());

        }
     }
     
