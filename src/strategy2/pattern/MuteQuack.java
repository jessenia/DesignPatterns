package strategy2.pattern;

/**
 * Created by Jessenia on 5/17/14.
 */
public class MuteQuack implements IQuackBehavior {


    @Override
    public void quack() {
        System.out.println("(silence)");
    }
}
