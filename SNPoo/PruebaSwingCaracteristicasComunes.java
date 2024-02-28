import java.awt.*;
import javax.swing.*;
import javax.swing.border.*;

public class PruebaSwingCaracteristicasComunes extends JFrame {
  public PruebaSwingCaracteristicasComunes() {
    // Crea un panel para un grupo de tres botones
    JPanel p1 = new JPanel(new FlowLayout(FlowLayout.LEFT, 2, 2));
    JButton jbtLeft = new JButton("Izquierdo");
    JButton jbtCenter = new JButton("Centro");
    JButton jbtRight = new JButton("Derecho");
    jbtLeft.setBackground(Color.WHITE);
    jbtCenter.setForeground(Color.GREEN);
    jbtRight.setToolTipText("Este es el boton derecho");
    p1.add(jbtLeft);
    p1.add(jbtCenter);
    p1.add(jbtRight);
    p1.setBorder(new TitledBorder("Tres Botones"));
    
    // Crea un font y un borde de linea
    Font largeFont = new Font("TimesRoman", Font.BOLD, 20);
    Border lineBorder = new LineBorder(Color.BLACK, 2);

    // Crea un panel para un grupo de dos etiquetas
    JPanel p2 = new JPanel(new GridLayout(1, 2, 5, 5));
    JLabel jlblRed = new JLabel("Rojo");
    JLabel jlblOrange = new JLabel("Naranja");
    jlblRed.setForeground(Color.RED);
    jlblOrange.setForeground(Color.ORANGE);
    jlblRed.setFont(largeFont);
    jlblOrange.setFont(largeFont);
    jlblRed.setBorder(lineBorder);
    jlblOrange.setBorder(lineBorder);
    p2.add(jlblRed);
    p2.add(jlblOrange);
    p2.setBorder(new TitledBorder("Dos etiquetas"));

    // Agrega dos paneles en el frame
    setLayout(new GridLayout(2, 1, 5, 5));
    add(p1);
    add(p2);
  }

  public static void main(String[] args) {

    // Crea un frame y un pone sus propiedades
    JFrame frame = new PruebaSwingCaracteristicasComunes();
    frame.setTitle("PruebaSwingCaracteristicasComunes");
    frame.setSize(300, 150);
    frame.setLocationRelativeTo(null); // Centra el frame
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.setVisible(true);
  }
}

