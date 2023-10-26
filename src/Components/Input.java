package Components;

import javax.swing.*;
import java.awt.*;

public class Input extends JTextField {
    public Input(){
        setOpaque(false);
        //setBackground(Color.CYAN);
        setBorder(null);
        setVisible(true);
        setFont(new Font("Arial", Font.BOLD, 15));
    }
}