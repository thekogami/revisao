package tela;
import javax.swing.JFrame;

public class minhatela extends JFrame {
    public minhatela() {
        super("Minha Tela");
        setSize(300, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }
    public static void main(String[] args) {
        new minhatela();
    }
  
}
