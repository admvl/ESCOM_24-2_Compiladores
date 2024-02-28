public class SerVivoR {
        boolean venado;
        boolean lechuga;
        
        public boolean esAnimal() {
           return venado;
        }

        public boolean esVegetal() {
           return lechuga;
        }

        boolean equals() {
           return false;
        }

        public static void main(String[] args) {
            SerVivoR s1 = new SerVivoR();
            SerVivoR s2 = new SerVivoR();
            
            boolean sa = s1.esAnimal();
            boolean sv = s2.esVegetal();
            
            if(sa.equals(sv))
               System.out.println("El venado no es una lechuga");
            else
               System.out.println("La lechuga no es un venado");

                    
        }
}
