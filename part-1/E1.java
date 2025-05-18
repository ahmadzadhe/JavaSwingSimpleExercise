import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

public class E1 extends JFrame implements ActionListener {
    int a=25;
    int b=25;
    int sumClicks=0;
    JButton button;
    JLabel label;
    JLabel imageLabel;
    ImageIcon imageMe;
    Random rand = new Random();
    E1(){
        setTitle("Ahmad");
        setResizable(false);
        setSize(500,500);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        label=new JLabel("Clicks : 0");
        label.setFont(new Font("Arial",Font.PLAIN,30));
        label.setHorizontalAlignment(SwingConstants.CENTER);
        label.setVerticalAlignment(SwingConstants.CENTER);
        button=new JButton("Click bro");
        ImageIcon imageBig= new ImageIcon("Screenshot 2025-05-07 203054.png");
        imageMe= new ImageIcon("407382bb-1b60-4a4e-918a-ddee03f336ac (2).png");
        Image setImage = imageMe.getImage().getScaledInstance(a, b, Image.SCALE_SMOOTH);
        ImageIcon setIcon = new ImageIcon(setImage);
        imageLabel=new JLabel(setIcon);
        setIconImage(imageBig.getImage());
        button.addActionListener(this);
        setLayout(new BorderLayout());
        add(button,BorderLayout.SOUTH);
        add(imageLabel,BorderLayout.CENTER);
        add(label,BorderLayout.NORTH);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        a+=25;
        b+=25;
        sumClicks++;
        label.setText("Click: "+ sumClicks);
        label.setForeground(new Color(rand.nextInt(255),rand.nextInt(255),rand.nextInt(250)));
        if(sumClicks%20==0||sumClicks%20==19){
            if(sumClicks%20==0){
                ImageIcon imageNextKiss=new ImageIcon("407382bb-1b60-4a4e-918a-ddee03f336ac (3).png");
                Image newNextK = imageNextKiss.getImage().getScaledInstance(500, 500, Image.SCALE_SMOOTH);
                ImageIcon setNextK = new ImageIcon(newNextK);
                imageLabel.setIcon(setNextK);
                a=25;
                b=25;
            }else{
                ImageIcon imageKiss=new ImageIcon("407382bb-1b60-4a4e-918a-ddee03f336ac (4).png");
                Image newKiss = imageKiss.getImage().getScaledInstance(500, 500, Image.SCALE_SMOOTH);
                ImageIcon setKiss= new ImageIcon(newKiss);
                imageLabel.setIcon(setKiss);
            }
        }else {
            Image newSet = imageMe.getImage().getScaledInstance(a, b, Image.SCALE_SMOOTH);
            ImageIcon setImage = new ImageIcon(newSet);
            imageLabel.setIcon(setImage);
        }
    }
    public static void main(String [] ags){
        new E1().setVisible(true);



    }

}