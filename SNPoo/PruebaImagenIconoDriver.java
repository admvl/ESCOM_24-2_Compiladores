import javax.swing.*;
import java.awt.*;

public class PruebaImagenIconoDriver extends JFrame {
  private ImageIcon usIcon = new ImageIcon("/media/jose/MEMUNO2019/E2AFD2.jpeg");
  private ImageIcon myIcon = new ImageIcon("/media/jose/MEMUNO2019/SAM_2598.JPG");
  private ImageIcon frIcon = new ImageIcon("image/fr.gif");
  private ImageIcon ukIcon = new ImageIcon("image/uk.gif");
  
  public PruebaImagenIconoDriver() {
    setLayout(new GridLayout(1, 4, 5, 5));
    add(new JLabel(usIcon));
    add(new JLabel(myIcon));
    add(new JButton(frIcon));
    add(new JButton(ukIcon));
  }
  
  /** El método principal */
  public static void main(String[] args) {
    PruebaImagenIconoDriver frame = new PruebaImagenIconoDriver();
    frame.setTitle("Colocar Iconos en el frame");
    frame.setSize(200, 200);
    frame.setLocationRelativeTo(null); // Se centra el frame
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.setVisible(true);
  }
}
