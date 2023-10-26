package Components;
import javax.swing.*;

public class ButtonVoltar extends JButton {
    public ButtonVoltar(){
        setOpaque(true);
        setFocusPainted(false);
        setBorderPainted(false);
        setContentAreaFilled(false);
        // assim eu preciso passar só a localização, já que,
        // o botao é o mesmo, mas adiciono ele em locais diferentes nas telas
        setSize(50,50);
    }
}
