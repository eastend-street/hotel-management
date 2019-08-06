import javax.swing.*;
import java.awt.*;

public class Display extends JFrame {
    public Display(){
        initDisplay();
    }

    void initDisplay(){
        this.setTitle("Hotel management");
        this.setSize(500, 500);
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel p = new JPanel();
        JButton button1 = new JButton("Login");
        p.add(button1);
        Container contentPane = getContentPane();
        p.setBackground(Color.white);
        contentPane.add(p, BorderLayout.CENTER);

        this.setVisible(true);
    }
}
