import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class E4 extends JFrame implements ActionListener {
    private JTextField txtName;           // User name input
    private JTextField txtEmail;          // User email input
    private JPasswordField txtPassword;   // Password input
    private JTextField YourAddress;
    private JTextField PostalCode;
    private JRadioButton rbMale, rbFemale;  // Gender selection
    private JCheckBox cbJava, cbPython, cbCpp;  // Interests selection
    private JCheckBox veryGood,Good,notBad,Bad;
    private JButton btnSubmit;            // Submit form button
    private GridBagConstraints gbc;       // Layout constraints
    public E4() {
        setTitle("User Registration");
        setSize(500, 350);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setResizable(false);
        JPanel panel = new JPanel(new GridBagLayout());
        gbc = new GridBagConstraints();
        gbc.insets = new Insets(5, 5, 5, 5);
        gbc.fill = GridBagConstraints.HORIZONTAL;

        // Row 0: Name label & field
        gbc.gridx = 0; gbc.gridy = 0;
        panel.add(new JLabel("Name:"), gbc);
        gbc.gridx = 1;
        txtName = new JTextField(20);
        panel.add(txtName, gbc);

        // Row 1: Email label & field
        gbc.gridx = 0; gbc.gridy = 1;
        panel.add(new JLabel("Email:"), gbc);
        gbc.gridx = 1;
        txtEmail = new JTextField(20);
        panel.add(txtEmail, gbc);

        // Row 2: Password label & field
        gbc.gridx = 0; gbc.gridy = 2;
        panel.add(new JLabel("Password:"), gbc);
        gbc.gridx = 1;
        txtPassword = new JPasswordField(20);
        panel.add(txtPassword, gbc);
        gbc.gridx =0; gbc.gridy=3;
        panel.add(new JLabel("YourAddress:"),gbc);
        gbc.gridx=1;
        YourAddress = new JTextField(20);
        panel.add(YourAddress,gbc);
        gbc.gridx=0; gbc.gridy=4;
        panel.add(new JLabel("PostalCode:"),gbc);
        gbc.gridx=1;
        PostalCode= new JTextField(20);
        panel.add(PostalCode,gbc);

        // Row 3: Gender selection
        gbc.gridx = 0; gbc.gridy = 5;
        panel.add(new JLabel("Gender:"), gbc);
        gbc.gridx = 1;
        rbMale = new JRadioButton("Male"); rbFemale = new JRadioButton("Female");
        ButtonGroup bg = new ButtonGroup(); bg.add(rbMale); bg.add(rbFemale);
        JPanel genderPanel = new JPanel(); genderPanel.add(rbMale); genderPanel.add(rbFemale);
        panel.add(genderPanel, gbc);

        // Row 4: Interests selection
        gbc.gridx = 0; gbc.gridy = 6;
        panel.add(new JLabel("Interests:"), gbc);
        gbc.gridx = 1;
        cbJava = new JCheckBox("Java"); cbPython = new JCheckBox("Python"); cbCpp = new JCheckBox("C++");
        JPanel interestPanel = new JPanel();
        interestPanel.add(cbJava); interestPanel.add(cbPython); interestPanel.add(cbCpp);
        panel.add(interestPanel, gbc);

        gbc.gridx =0; gbc.gridy =7;
        panel.add(new JLabel("HowGoodIn"),gbc);
        gbc.gridx=1;
        veryGood=new JCheckBox("VeryGood"); Good=new JCheckBox("Good");
        notBad=new JCheckBox("Not Bad"); Bad=new JCheckBox("Bad");
        JPanel HowGood= new JPanel();
        HowGood.add(veryGood); HowGood.add(Good);HowGood.add(notBad);HowGood.add(Bad);
        panel.add(HowGood,gbc);

        // Row 5: Submit button
        gbc.gridx = 1; gbc.gridy = 8;
        gbc.anchor = GridBagConstraints.CENTER;
        btnSubmit = new JButton("Submit");
        btnSubmit.addActionListener(this);
        panel.add(btnSubmit, gbc);

        add(panel);
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        String name = txtName.getText();
        String email = txtEmail.getText();
        String yourAddress=YourAddress.getText();
        String postalCode=PostalCode.getText();
        String gender = rbMale.isSelected() ? "Male" : rbFemale.isSelected() ? "Female" : "Unspecified";
        String interests = "";
        if (cbJava.isSelected()) interests += "Java ";
        if (cbPython.isSelected()) interests += "Python ";
        if (cbCpp.isSelected()) interests += "C++ ";
        String HowGood = "";
        if(veryGood.isSelected()) HowGood+="VeryGood";
        if(Good.isSelected()) HowGood+="Good";
        if(notBad.isSelected()) HowGood+="NotBad";
        if (Bad.isSelected())HowGood+="Bad";

        JOptionPane.showMessageDialog(this,
                "Name: " + name + "\n" +
                        "Email: " + email + "\n" +
                        "YourAddress:"+yourAddress+"\n"+
                        "PostalCode:"+postalCode+"\n"+
                        "Gender: " + gender + "\n" +
                        "HowGoodIn:"+ HowGood + "\n"+
                        "Interests: " + interests,

                "Registration Details", JOptionPane.INFORMATION_MESSAGE);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new E4().setVisible(true));
    }


}