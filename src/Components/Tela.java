package Components;
import javax.swing.*;
import java.awt.*;

public class Tela extends JFrame {
    // criando a classe que vou usar como um 'molde' para as outras telas

    public Tela(String backgroundImage){
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100,100,460,755);
        setVisible(true);
        setLayout(null);
        setResizable(true);

        JPanel mainPanel = new JPanel() {
            @Override
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);
                ImageIcon icon = new ImageIcon(backgroundImage);
                Image image = icon.getImage();
                g.drawImage(image, 0, 0, 450, 755, this);
            }
        };

        mainPanel.setLayout(null);
        setContentPane(mainPanel);
        setLocationRelativeTo(null);
        setResizable(false);
        setVisible(true);
    }
}
