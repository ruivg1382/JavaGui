import javax.swing.*;
import java.awt.*;

class Gui04_Font extends JFrame{

    private JLabel label;

    public Gui04_Font(){

        Font letra = new Font("Verdana",Font.BOLD,28);
        label = new JLabel("Texto de Experimento");
        label.setBounds(20,20,400,30);
        label.setFont(letra);
        label.setForeground(Color.blue);
        label.setBackground(Color.yellow);
        label.setOpaque(true);
        add(label);
    }


    public static void main(String[] args){

        Gui04_Font janela = new Gui04_Font();

        janela.setLayout(null);
        janela.setBounds(0,0, 600,500);
        janela.setLocationRelativeTo(null);
        janela.setVisible(true);

        janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);


    }
}