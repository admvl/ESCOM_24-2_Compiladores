import javax.swing.*;
import java.awt.*;

public class VentanaSimpleA extends JFrame {
    private static final int ANCHO = 250;
    private static final int ALTO = 100;
    
    public VentanaSimpleA() {
        setTitle("Ventana simple");
        setSize(ANCHO, ALTO);
        setLayout(new FlowLayout());
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        crearContenidos();
        setLocationRelativeTo(null);
        setVisible(true);
    }
    
    private void crearContenidos() {
        JLabel etiqueta = new JLabel("Título de la etiqueta");
        add(etiqueta);
    }
    
    public static void main(String[] args) {
        new VentanaSimpleA();
    }
}
