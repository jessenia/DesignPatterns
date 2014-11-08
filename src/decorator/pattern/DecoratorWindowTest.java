package decorator.pattern;

/**
 * Created by Jessenia on 5/18/14.
 */
public class DecoratorWindowTest {
    public static void main(String[] args) {
        // Create a decorated Window with horizontal and vertical scrollbars
        Window decoratedWindow = new HorizontalScrollBarDecorator (
                new VerticalScrollBarDecorator (new SimpleWindow()));


        // Print the Window's description
        System.out.println(decoratedWindow.getDescription());

        decoratedWindow.draw();
    }
}
