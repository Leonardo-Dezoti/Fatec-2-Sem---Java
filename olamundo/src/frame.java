import javax.swing.*;
import java.awt.*;

public class frame {

    static void showFrame() {
        JFrame frame1 = new JFrame("Teste");
        frame1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        frame1.setPreferredSize(new Dimension(400, 300));
        frame1.pack();
        frame1.setLocationRelativeTo(null);
        frame1.setVisible(true);
    }

}
