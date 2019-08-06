import javax.swing.*;
import java.awt.*;

public class Display extends JFrame {
    public Display(){
        drawDisplay();
    }

    void drawDisplay(){
        this.setTitle("Hotel management");
        this.setSize(500, 500);
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.getContentPane().setBackground(Color.white);
        this.setVisible(true);

    }
}
