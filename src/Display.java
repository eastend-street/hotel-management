import javax.swing.*;
import java.awt.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Display extends JFrame {
    public Display(){
        initDisplay();
        connectDatabaseTest();
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

    void connectDatabaseTest(){
        System.out.println("hello");
        Connection connection_mysql = null;
        connection_mysql = DriverManager.getConnection("jdbc:mysql://localhost:3306/sample", "user_name", "password");
    }
}
