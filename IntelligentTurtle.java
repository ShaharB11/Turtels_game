import Turtle.Turtle;
public class IntelligentTurtle extends Turtle {
	public void draw(int sides, double size) // draw a polygon in the given sides and size
	{
		if(sides>=3 && size>0) {
			int sum_angle=180*(sides-2);
			int angle= sum_angle/sides;
			this.tailDown();
			this.turnRight(90);
			for(int i=0;i<=sides-1;i++) {
				this.moveForward(size);
				this.turnLeft(180-angle);
			}
		}
	}

}

