import java.awt.Color;
import java.awt.Dimension;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextArea;

public class AdicionaProduto{
    public static void main(String[] args) {
        JFrame j = new JFrame("Adicionar Produto à loja");
        jPanel jp = new jPanel();
        j.add(jp);
        j.pack();
        j.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        j.setLocationRelativeTo(null);
        j.setVisible(true);
    }
}

class jPanel extends JPanel{
    JButton adicionar = new JButton("Adicionar");
    JTextArea area=new JTextArea("");

    public jPanel(){
        this.setPreferredSize(new Dimension(500,200));
        this.setBackground(Color.lightGray);
        this.setLayout(null);
        this.add(adicionar);
        this.add(area);

        this.add(adicionar);
        adicionar.setBounds(10,70,90,30);
        adicionar.setFocusable(false);
        adicionar.addActionListener(e->{
            if (area.getText() == "cu") {
                System.out.println("esta escrito cu");
            }else{
                System.out.println("");
            }
        });

        area.setBounds(130, 70, 400, 30);
    }
}