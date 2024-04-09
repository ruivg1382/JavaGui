import javax.swing.*;
class Gui03_JLabel extends JFrame{

    private JLabel label;

    public Gui03_JLabel(){

        label = new JLabel("Minha Label");
        label.setBounds(50,50,300,20);
        add(label);


    }

    public static void main(String[] args){

        Gui03_JLabel janela = new Gui03_JLabel();
        janela.setLayout(null);
        janela.setBounds(100,100,600,600);
        janela.setTitle("App de JLabel");
        janela.setLocationRelativeTo(null);
        janela.setVisible(true);
        janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }
}