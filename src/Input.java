import javax.swing.*;
import java.awt.*;

public class Input extends JTextField {
    public Input(){
        //setOpaque(false);
        setBackground(Color.CYAN);
        setBorder(null);
        setVisible(true);
        setEditable(false);
        setFont(new Font("Arial", Font.BOLD, 15));
    }
}