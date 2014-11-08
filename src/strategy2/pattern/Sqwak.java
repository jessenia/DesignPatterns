package strategy2.pattern;

/**
 * Created by Jessenia on 5/17/14.
 */
public class Sqwak implements IQuackBehavior {
    @Override
    public void quack() {
        System.out.println("Sqwak!");
    }
}
