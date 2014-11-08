package strategy.pattern;

public class TestRobot {

	public static void main(String[] args){
	Robot r1 = new Robot("EvilRobot");
	Robot r2 = new Robot("SuperRobot");
	Robot r3 = new Robot("CitizenRobot");

	r1.setBehavior(new AggressiveBehavior());
	r2.setBehavior(new DefensiveBehavior());
	r3.setBehavior(new NormalBehavior());

	r1.move();
	r2.move();
	r3.move();


	}


}
