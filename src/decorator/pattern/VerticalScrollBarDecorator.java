package decorator.pattern;

import javax.swing.*;
import java.awt.*;

import static java.awt.BorderLayout.EAST;
import static javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS;

/**
 * Created by Jessenia on 5/18/14.
 */
public class VerticalScrollBarDecorator extends WindowDecorator {


    public VerticalScrollBarDecorator(Window decoratedWindow) {
        super(decoratedWindow);
    }

    @Override
    public void draw(){
        super.draw();
        drawVerticalScrollBar();
    }

    private void drawVerticalScrollBar() {
        JFrame frame = new JFrame("VerticalScrollBarDecorator");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JLabel label = new JLabel("In draw method of: " + this.getClass().getName() + ". This is a window with a vertical scroll bar.", SwingConstants.CENTER);
        label.setPreferredSize(new Dimension(300,100));

        JScrollBar scrollBar = new JScrollBar(JScrollBar.VERTICAL);

        frame.getContentPane().add(label, BorderLayout.CENTER);
        frame.getContentPane().add(scrollBar, EAST);
        frame.setLocationRelativeTo(null);
        frame.pack();
        frame.setVisible(true);

    }

    @Override
    public String getDescription(){
        return super.getDescription() + ", including vertical scrollbar.";
    }
}
