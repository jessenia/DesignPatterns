package decorator.pattern;

import javax.swing.*;
import java.awt.*;

/**
 * Created by Jessenia on 5/18/14.
 */
public class HorizontalScrollBarDecorator extends WindowDecorator {

    public HorizontalScrollBarDecorator(Window decoratedWindow) {
        super(decoratedWindow);
    }

    @Override
    public void draw(){
        super.draw();
        drawHorizontalScrollBar();
    }

    private void drawHorizontalScrollBar() {
        JFrame frame = new JFrame("HorizontalScrollBarDecorator");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JLabel label = new JLabel("In draw method of: " + this.getClass().getName() + ". This is a window with a horizontal scroll bar.", SwingConstants.CENTER);
        label.setPreferredSize(new Dimension(300,100));

        JScrollBar scrollBar = new JScrollBar(JScrollBar.HORIZONTAL);

        frame.getContentPane().add(label, BorderLayout.CENTER);
        frame.getContentPane().add(scrollBar, BorderLayout.SOUTH);
        frame.setLocationRelativeTo(null);
        frame.pack();
        frame.setVisible(true);

    }

    @Override
    public String getDescription(){
        return super.getDescription() + ", including horizontal scrollbar.";
    }
}
