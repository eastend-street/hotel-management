import javax.swing.*;
import java.awt.*;

public class UserLogin extends JFrame {
    JLabel usernameLabel, passwordLabel, loginFormLabel;
    JTextField username;
    JPasswordField password;
    JButton loginButton;

    public UserLogin(){
        initUserLogin();
    }


    void initUserLogin(){

        JFrame frame = new JFrame("Login");

        // All labels

        loginFormLabel = new JLabel("Welcome!");
        loginFormLabel.setForeground(Color.black);
        loginFormLabel.setFont(new Font("Serif", Font.BOLD, 20));

        usernameLabel = new JLabel("Username");
        passwordLabel = new JLabel("Password");

        // All text fields

        username = new JTextField();
        password = new JPasswordField();

        loginButton = new JButton("Login");

        // Components configuration

        loginFormLabel.setBounds(240, 30, 400, 30);
        usernameLabel.setBounds(140, 70, 200, 30);
        passwordLabel.setBounds(140, 110, 200, 30);
        username.setBounds(240, 70, 200, 30);
        password.setBounds(240, 110, 200, 30);
        loginButton.setBounds(240, 160, 100, 30);

        frame.add(loginFormLabel);
        frame.add(usernameLabel);
        frame.add(passwordLabel);
        frame.add(username);
        frame.add(password);
        frame.add(loginButton);

        frame.setSize(550,300);
        frame.setLayout(null);
        frame.setVisible(true);


        // The code above is necessary to center the window at the center of the screen

        Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
        frame.setLocation(dim.width/2-frame.getSize().width/2, dim.height/2-frame.getSize().height/2);



    }
}


