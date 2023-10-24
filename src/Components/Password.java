package Components;

import javax.swing.*;
import java.awt.*;

public class Password extends JPasswordField {
    public Password(){
        //setOpaque(false);
        setBackground(Color.CYAN);
        setBorder(null);
        setVisible(true);
        setFont(new Font("Arial", Font.BOLD, 15));
    }
}
