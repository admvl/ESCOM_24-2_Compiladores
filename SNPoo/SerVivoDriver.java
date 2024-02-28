class SerVivo {
    boolean venado;
    boolean lechuga;
       
    boolean esAnimal() {
        return venado;
    }
       
    boolean esVegetal() {
        return lechuga;
    }
}

public class SerVivoDriver {
    public static void main(String[] args) {
        SerVivo ser = new SerVivo();
        
        if(ser.esAnimal())
            System.out.println("El venado es un animal");
        else
            System.out.println("La lechuga es un vegetal");
    }
}
