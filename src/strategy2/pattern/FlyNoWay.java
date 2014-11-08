package strategy2.pattern;

/**
 * Created by Jessenia on 5/17/14.
 */
class FlyNoWay implements IFlyBehavior {

    public void fly() {
        System.out.println("This bird can not fly.");
    }
}
