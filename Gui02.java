import javax.swing.*;

class Gui02 extends JFrame{

    public static  void main(String[] args){

        Gui02 form = new Gui02();
        form.setLayout(null);
        form.setTitle("Minha Aplicacao");
        form.setBounds(100,150,500,500);
        form.setVisible(true);
        form.setLocationRelativeTo(null); // no centro
        form .setResizable(false); // impedir redimensionamento
        form.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);


    }


}