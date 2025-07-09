public class JumpyTurtle extends IntelligentTurtle {
	public void moveForward(double dist)//Move the turtle by drawing 6 and then not drawing 6 and so on...
	{
		this.tailDown();
		double count_move=0;
		while(count_move<=dist)
		{
			move_Jump_Turtle();
			count_move+=6;
			how_to_move(count_move);
		}
	}
		private void how_to_move(double count_move)//deciding when to start draw again and when to stop.(for example if its 24 it's start again and so on...
		{
			if(count_move%4==0)
			{
				this.tailDown();
			}else
			{
				this.tailUp();
			}
		}
		private void move_Jump_Turtle()//Move the Turtle by using his "father" moveForward method.
		{
			super.moveForward(6);
		}
		public void move_to_line(int steps)//Move the turtle to the line by using his "father" moveForward method.
		{
			super.moveForward(steps);
		}
	}

