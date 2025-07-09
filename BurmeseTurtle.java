public class BurmeseTurtle extends IntelligentTurtle {
	public void moveForward(int sides, double size)//If random bigger then 40 draw polygon with one less side.Else draw polygon with length of the sides as 18.
	{
		double rand=Math.random();
		double rand_final=rand*100;
		sides = this.legal_sides(sides,rand_final);
		if(how_to_move(rand_final))
		{
			this.draw((sides-1), size);
			this.hide();
		}else
		{
			this.draw(sides,18);
		}
	}
	private boolean how_to_move(double rand_final)//Return true if the random is less then 40.
	{
		if(rand_final<=40)
		{
			return true;
		}
		return false;
	}
	public void move_to_line(int steps)//Move the turtle to the line by the use of his "father" moveForaward method.
	{
		super.moveForward(steps);
	}
	private int legal_sides(int sides, double rand_final)//Checks if the number of sides given is legal (bigger then 3) and if not legal return 4.
	{
		if(sides<=3 && how_to_move(rand_final))
		{
			return 4;
		}
		return sides;
	}
}

