/**
 *
 */
package strategy.pattern;

/**
 * @author Jessenia
 *
 */
public class Robot {
	IBehavior behavior;
	String name;

	public Robot(String name){
		this.name = name;
	}

	public IBehavior getBehavior() {
		return behavior;
	}

	public void setBehavior(IBehavior behavior) {
		this.behavior = behavior;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}


	public void move(){
		System.out.print(this.name + " is ");
		behavior.moveCommand();

	}



}
