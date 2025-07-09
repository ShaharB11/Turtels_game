public class GrumpyTurtle extends DrunkTurtle {
	public void moveForward(double x){//Move the turtle according to the random number, or just flip him.
		double rand=Math.random();
		double rand_final=rand*100;
		if(how_to_move(rand_final)) 
		{
			this.turnLeft(180);	
		}else
		{
			super.moveForward(x);
		}
	}

	private boolean how_to_move(double rand_final)//Return true if the turtle need to flip and false if the turtle need to move.
	{
		if(rand_final<=50)
		{
			return true;
		}
		return false;
	}

}

