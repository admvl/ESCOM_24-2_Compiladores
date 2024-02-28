import javax.swing.JFrame;
public class MiFrame {
  public static void main(String[] args) {
    JFrame frame = new JFrame("Ttulo del contenedor"); // Crea un frame
    frame.setSize(600, 100); // pone el tamanio del frame
    frame.setLocationRelativeTo(null); // Centra al frame
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.setVisible(true); // Despliega al frame
  }
}  
