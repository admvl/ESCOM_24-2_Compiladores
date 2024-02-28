import java.awt.*;
import javax.swing.*;

public class PruebaDePaneles extends JFrame {
  public PruebaDePaneles() {
    // Se crae el panel p1 por el buttons y set GridLayout
    JPanel p1 = new JPanel();
    p1.setLayout(new GridLayout(4, 3));
    
    // Agregar los botones al panel
    for (int i = 1; i <= 9; i++) {
      p1.add (new JButton("" + i));
    }
    
    p1.add(new JButton("" + 0));
    p1.add(new JButton("Iniciar"));
    p1.add(new JButton("Parar"));
    // Se crea el panel p2 para tener un campo de texto y p1
    JPanel p2 = new JPanel(new BorderLayout());
    p2.add (new JTextField("Botones para dar el tiempo de cocinado"),
      BorderLayout.NORTH);
    p2.add (p1, BorderLayout.CENTER);
    
    // Agregar contenidos en el frame
    add(p2, BorderLayout.EAST);
    add(new JButton("Puerta del horno"),
    BorderLayout.CENTER);
  }

  /** Método principal */
  public static void main(String[] args) {
    PruebaDePaneles frame = new PruebaDePaneles();
    frame.setTitle("La vista frontal del horno de microondas");
    frame.setSize(400, 250);
    frame.setLocationRelativeTo(null); // Centra al frame
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.setVisible(true);
  }
}
