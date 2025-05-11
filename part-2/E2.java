import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

public class E2 extends JFrame implements ActionListener {
    Random rand = new Random();
    private String[] AlfBa={"mahdi","Soios","Nahar"};
    String BordAlfba;
    String DBordAlfba;
    int chose;
    int Win=0;
    StringBuilder YourAlFba;
    private JTextField Text;
    private JLabel label;
    private JLabel labelAlfBA;
    private JLabel Dar = new JLabel(new ImageIcon("ChobDar.png"));
    private JButton button;
    E2(){
        BordAlfba=AlfBa[rand.nextInt(3)];
        YourAlFba=new StringBuilder();
        chose=BordAlfba.length();
        DBordAlfba=BordAlfba;
        for(int i=0 ; i<BordAlfba.length();i++){
            YourAlFba.append("-");
        }
        labelAlfBA=new JLabel(YourAlFba.toString());
        setTitle("HaDs AlfBa");
        label=new JLabel("Welcome");
        button=new JButton("Enter AlfBa");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setResizable(false);
        setSize(450,450);
        Text=new JTextField(15);
        button.addActionListener(this);
        setLayout(new BorderLayout());
        labelAlfBA.setBounds(225,325,100,30);
        add(labelAlfBA);
        add(label,BorderLayout.NORTH);
        add(Text,BorderLayout.SOUTH);
        add(button,BorderLayout.NORTH);
        add(Dar,BorderLayout.CENTER);
    }

    public static void main(String[] ags){
        new E2().setVisible(true);
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        String name=Text.getText().trim();
        if(BordAlfba.indexOf(name.charAt(0))!=-1){
            Win++;
            if(Win==5){
                chose=99;
                Dar.setIcon(new ImageIcon("Win.png"));
            }
            YourAlFba.setCharAt(DBordAlfba.indexOf(name.charAt(0)),name.charAt(0));
            BordAlfba= BordAlfba.substring(0,BordAlfba.indexOf(name.charAt(0))) + BordAlfba.substring(BordAlfba.indexOf(name.charAt(0))+1);
        } else {
            switch (chose){
                case 99:
                    Dar.setIcon(new ImageIcon("Win.png"));
                    break;
                case 5:
                    Dar.setIcon(new ImageIcon("Sar.png"));
                    chose--;
                    break;
                case 4:
                    Dar.setIcon(new ImageIcon("Tan.png"));
                    chose--;
                    break;
                case 3:
                    Dar.setIcon(new ImageIcon("Pa.png"));
                    chose--;
                    break;
                case 2:
                    Dar.setIcon(new ImageIcon("DAsR.png"));
                    chose--;
                    break;
                case 1:
                    Dar.setIcon(new ImageIcon("DAsCh.png"));
                    chose--;
                    break;
                default:
                    Dar.setIcon(new ImageIcon("End.png"));
                    break;
            }

        }
        labelAlfBA.setText(YourAlFba.toString());


    }
}