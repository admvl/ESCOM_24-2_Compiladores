import javax.swing.JButton;
import javax.swing.JFrame;
import java.awt.BorderLayout;

public class ShowBorderLayout extends JFrame {
  public ShowBorderLayout() {
    // Poner BorderLayout con intervalo horizontal de 5 e intervalo vertical de 10
    setLayout( new BorderLayout(5, 10) );
    // Agrega botones al frame
    add(new JButton("Derecha Este"), BorderLayout.EAST);
    add(new JButton("Abajo Sur"), BorderLayout.SOUTH);
    add(new JButton("Izquierda Oeste"), BorderLayout.WEST);
    add(new JButton("Arriba Norte"), BorderLayout.NORTH);
    add(new JButton("Centrado Centro"), BorderLayout.CENTER);
  }
  
  /** Método main */
  public static void main(String[] args) {
    ShowBorderLayout frame = new ShowBorderLayout();
    frame.setTitle("Puntos cardinales");
    frame.setSize(300, 200);
    frame.setLocationRelativeTo(null); // Centra el frame
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.setVisible(true);
  }
}
