import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

public class E3 extends JFrame implements ActionListener {
    private JPanel mainPanel;      // The panel whose background will change
    private JButton redButton;     // Button to select red theme
    private JButton greenButton;   // Button to select green theme
    private JButton blueButton;    // Button to select blue theme
    private JButton purpleBurron;
    private JButton myColor;
    Random rand= new Random();
    public E3() {
        setTitle("Theme Color Selector");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(500,500);
        mainPanel = new JPanel();
        setLocationRelativeTo(null);
        redButton = new JButton("Red");
        greenButton = new JButton("Green");
        blueButton = new JButton("Blue");
        purpleBurron=new JButton("purple");
        myColor= new JButton(("RandomColor"));
        redButton.setActionCommand("RED");
        greenButton.setActionCommand("GREEN");
        blueButton.setActionCommand("BLUE");
        purpleBurron.setActionCommand("Purple");
        myColor.setActionCommand("RandColor");

        redButton.addActionListener(this);
        greenButton.addActionListener(this);
        blueButton.addActionListener(this);
        purpleBurron.addActionListener(this);
        myColor.addActionListener(this);
        JPanel buttonPanel = new JPanel();
        buttonPanel.add(redButton);
        buttonPanel.add(greenButton);
        buttonPanel.add(blueButton);
        buttonPanel.add(purpleBurron);
        buttonPanel.add(myColor);
        setLayout(new BorderLayout());
        add(buttonPanel, BorderLayout.NORTH);
        add(mainPanel, BorderLayout.CENTER);
    }


    @Override
    public void actionPerformed(ActionEvent e) {
            switch (e.getActionCommand()) {
                case "RED":   mainPanel.setBackground(Color.RED);   break;
                case "GREEN": mainPanel.setBackground(Color.GREEN); break;
                case "BLUE":  mainPanel.setBackground(Color.BLUE);  break;
                case "Purple": mainPanel.setBackground(new Color(128, 0, 128)); break;
                case "RandColor": mainPanel.setBackground(new Color(rand.nextInt(255),rand.nextInt(255),rand.nextInt(255)));


            }

    }
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new E3().setVisible(true));
    }
}