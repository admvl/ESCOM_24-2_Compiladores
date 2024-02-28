import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JFrame;
import java.awt.GridLayout;
import javax.swing.JButton;

public class ShowGridLayout extends JFrame {
  public ShowGridLayout() {
    // Poner GridLayout con, 3 renglones, 2 columnas, 5 es el intervalo entre 
    // componentes horizontales y 5 verticales
    setLayout( new GridLayout(4, 2, 5, 5));
    // Agregar etiquetas y campos de texto en el frame
    add(new JLabel("Nombre"));
    add(new JTextField(8));
    add(new JLabel("Apellido"));
    add(new JTextField(8));
    add(new JLabel("Género"));
    add(new JTextField(1));
  }

  /** Método principal */
  public static void main(String[] args) {
    ShowGridLayout frame = new ShowGridLayout();
    JButton boton = new JButton("Iniciar");
    
    frame.add(boton);    
    frame.setTitle("Lista de estudiantes");
    frame.setSize(500, 175);
    frame.setLocationRelativeTo(null); // Centra el frame
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.setVisible(true);
  }
}
