package Components;

import javax.swing.*;
import java.awt.*;

public class Password extends JPasswordField {
    public Password(){
        //setOpaque(false);
        setBackground(Color.CYAN);
        setBorder(null);
        setVisible(true);
        setEditable(false);
        setFont(new Font("Arial", Font.BOLD, 15));
    }
}
