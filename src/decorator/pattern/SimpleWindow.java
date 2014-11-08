package decorator.pattern;

import javax.swing.*;
import java.awt.*;

/**
 * Created by Jessenia on 5/18/14.
 */
public class SimpleWindow implements Window{
    @Override
    public void draw() {
        JFrame frame = new JFrame("SimpleWindow");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JLabel label = new JLabel("In draw method of: " + this.getClass().getName() + ". This is a simple window.", SwingConstants.CENTER);
        label.setPreferredSize(new Dimension(300,100));

        frame.getContentPane().add(label, BorderLayout.CENTER);
        frame.setLocationRelativeTo(null);
        frame.pack();
        frame.setVisible(true);


    }

    @Override
    public String getDescription() {
        return "Simple Window";
    }
}
