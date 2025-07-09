import Turtle.Turtle;
public class DrunkTurtle extends Turtle {
	public void moveForward(double x) //Move the drunk turtle by his rules.
	{
		double rand=Math.random();
		super.moveForward(x*rand);
		double rand_final=rand*100;
		this.tailDown();
		move_to_right(rand_final);
		rand=Math.random();
		rand_final=rand*100;
		move_to_the_opposite_side(rand_final,x);
	}
	private void move_to_right(double rand_final)//Turns the turtle 90 degrees according to instructions.
	{
		if(rand_final<=40)
		{
			super.turnRight(90);
		}
	}
	private void move_to_the_opposite_side(double rand_final, double x)//Move the turtle according to the random number.
	{
		if(rand_final<=45)
		{
			super.moveForward(((rand_final)/100)*x);
		}
		else
		{
			this.turnLeft((int)(180));
			super.moveForward((rand_final/100)*x);
		}
	}
	public void turnLeft(int i)//Turn left by the turtle rules any degree that enter multiply by 1.5 * random number.
	{
		super.turnLeft((int)(i*1.5*Math.random()));
	}
	public void turnRight(int i)//Turn right by the turtle rules any degree that enter multiply by 1.5 * random number.
	{
		super.turnRight((int)(i*1.5*Math.random()));
	}
	protected void move_sahi(int steps)//Use the turtle by his forefather.
	{
		super.moveForward(steps);
	}
	public void turnRightSahi(int i) {//Turn right normal by the function of the forefather.
		super.turnRight(i);
	}
	public void turnLeftSahi(int i) {////Turn left normal by the function of the forefather.
		super.turnLeft(i);
	}
}
