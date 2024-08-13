package tela;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class minhatela extends JFrame {
    public minhatela() {
        super("Minha Tela");
        setSize(300, 300);

        var meuTexto = new JLabel("Aula de Swing pratico");
        var Uni = new JLabel("Univille");
        meuTexto.setFont(new java.awt.Font("Arial", java.awt.Font.BOLD, 20));
        Uni.setFont(new java.awt.Font("Arial", java.awt.Font.BOLD, 20));

        var newBotao = new JButton("Clique aqui");
        var controller = new controller.ControllerTela();
        newBotao.addActionListener(controller);


        getContentPane().add("North",meuTexto);
        getContentPane().add("Center", Uni);
        getContentPane().add("South", newBotao);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }
    public static void main(String[] args) {
        new minhatela();
    }
  
}