package strategy2.pattern;

/**
 * Created by Jessenia on 5/17/14.
 */
public class TestDuck {

    public static void main(String[] args) {
        Duck d1 = new MallardDuck("Mallard Duck", 12566, "China");
        Duck d2 = new RealDuck("Real Duck", 782985473, "United States");
        Duck d3 = new ToyDuck("Rubber Duck", 374262, "Thailand");

        d1.setFlyBehavior(new FlyNoWay());
        d1.setQuackBehavior(new MuteQuack());


        d2.setFlyBehavior(new FlyWithWings());
        d2.setQuackBehavior(new RegularQuack());

        d3.setFlyBehavior(new FlyNoWay());
        d3.setQuackBehavior(new Sqwak());


        d1.performQuack();
        d1.performFly();

        d2.performQuack();
        d2.performFly();

        d3.performQuack();
        d3.performFly();


    }
}
