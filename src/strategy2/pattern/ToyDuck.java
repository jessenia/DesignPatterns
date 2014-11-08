package strategy2.pattern;

/**
 * Created by Jessenia on 5/17/14.
 */
public class ToyDuck extends Duck {
    IFlyBehavior flyBehavior;
    IQuackBehavior quackBehavior;
    String name;
    int modelNo;
    String countryOfOrigin;

    public ToyDuck(String name, int modelNo, String countryOfOrigin) {
        this.name = name;
        this.modelNo = modelNo;
        this.countryOfOrigin = countryOfOrigin;
    }


    public void setQuackBehavior(IQuackBehavior quackBehavior) {
        this.quackBehavior = quackBehavior;
    }


    public void setFlyBehavior(IFlyBehavior flyBehavior) {
        this.flyBehavior = flyBehavior;
    }

    public void swim() {
        super.swim();
    }


    public void display() {
        super.display();

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    public int getModelNo() {
        return modelNo;
    }

    public void setModelNo(int modelNo) {
        this.modelNo = modelNo;
    }

    public String getCountryOfOrigin() {
        return countryOfOrigin;
    }

    public void setCountryOfOrigin(String countryOfOrigin) {
        this.countryOfOrigin = countryOfOrigin;
    }


    @Override
    public void performQuack() {
        System.out.println("In performQuack method of " + this.getClass().getName());
        quackBehavior.quack();


    }


    @Override
    public void performFly() {

        System.out.println("In performFly method of " + this.getClass().getName());
        flyBehavior.fly();

    }
}
