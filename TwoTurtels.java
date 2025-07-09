import Turtle.*;
import java.util.Scanner; 
public class TwoTurtels {
	static Scanner reader = new Scanner(System.in);
	public static void main(String[] args) {
		
		move_turtels();//Main function.
	}


	private static void move_turtels() {//Move the turtle by their rules and the user input.
		Turtle Ezi = new Turtle();
		Turtle Edi = new Turtle();
		draw_monster(Ezi,Edi);
		move_intelligentTurtle();
		move_drunk_turtle();
		move_jumpyTurtle();
		move_grumpyturtle();
		move_burmeseTurtle();
	}
	public static void draw_monster(Turtle Ezi,Turtle Edi)//Draw monster with two turtles.
	{
		draw_an_upper_body(Edi);
		draw_an_lower_body(Ezi);

	}

	public static void draw_an_upper_body(Turtle Edi) {//Draw the upper body - head and body.
		Edi.turnLeft(90);
		Edi.moveForward(30);
		Edi.turnRight(90);
		Edi.moveForward(50);
		Edi.turnRight(90);
		Edi.moveForward(60);
		Edi.turnRight(90);
		Edi.moveForward(50);
		Edi.turnRight(90);
		Edi.moveForward(30);
		Edi.turnLeft(90);
		Edi.moveForward(110);
	}
	public static void draw_an_lower_body(Turtle Ezi) {//Draw the lower body hands and legs.
		Ezi.tailUp();
		Ezi.turnLeft(180);
		Ezi.moveForward(60);
		Ezi.turnRight(90);
		Ezi.tailDown();
		Ezi.moveForward(50);
		Ezi.turnRight(180);
		Ezi.moveForward(100);
		Ezi.turnLeft(180);
		Ezi.moveForward(50);
		Ezi.turnLeft(90);
		Ezi.tailUp();
		Ezi.moveForward(50);
		Ezi.turnLeft(45);
		Ezi.tailDown();
		Ezi.moveForward(80);
		Ezi.turnLeft(180);
		Ezi.moveForward(80);
		Ezi.turnLeft(90);
		Ezi.moveForward(80);
	}
	private static void move_intelligentTurtle() {////Draw a polygon using the intelligent Turtle with the user size,sides.
		System.out.println("Move intelligentTurtle");
		int sides=get_sides();
		double size=get_size();
		IntelligentTurtle intel_turtle=new IntelligentTurtle();
		intel_turtle.draw(sides,size);
	}
	private static void move_drunk_turtle() {//Move the drunk turtle by his rules with the user number of steps.
		System.out.println("Move drunkTurtle");
		DrunkTurtle drunk_turtle=new DrunkTurtle();
		int steps = get_steps();
		int degree = getDegree();
		System.out.println("where do you like to turn");
		String answer = reader.next();
		if(answer == "left")
		{
			drunk_turtle.turnLeft(degree);
		}
		else
		{
			drunk_turtle.turnRight(degree);
		}
		drunk_turtle.moveForward(steps);
	}
	private static void move_jumpyTurtle() {//Move the jumpy turtle by the user number of steps.
		System.out.println("Move jumpyTurtle");
		JumpyTurtle jump_turtle=new JumpyTurtle();
		int steps = get_steps();
		jump_turtle.moveForward(steps);
	}
	private static void move_grumpyturtle() {//Move the grumpy turtle by the user number of steps.
		System.out.println("Move grumpyTurtle");
		GrumpyTurtle grumpy_turtle=new GrumpyTurtle();
		int steps = get_steps();
		grumpy_turtle.moveForward(steps);
	}
	private static void move_burmeseTurtle() {//Draw a polygon using the burmese Turtle with the user size,sides.
		System.out.println("Move burmeseTurtle");
		int sides=get_sides();
		double size=get_size();
		BurmeseTurtle burmese_turtle= new BurmeseTurtle();
		burmese_turtle.moveForward(sides,size);
	}
	private static int get_steps() {//Gets the number of steps for the turtle to move.
		System.out.println("Enter steps");
		int steps = reader.nextInt();
		if(steps<=0)
		{
			System.out.println("Wrong input, stpes must be a positive number");
			return get_steps();
		}
		return steps;
	}


	private static double get_size() {//Gets the size of each side in the polygon from the user.
		System.out.println("Enter size");
		double size = reader.nextDouble();
		if(size<1)
		{
			System.out.println("Wrong input, size must be a positive number");
			return get_size();
		}
		return size;
	}


	private static int get_sides() {//Get how many sides to the polygon from the user.
		System.out.println("Enter sides");
		int sides = reader.nextInt();
		if(sides<3)
		{
			System.out.println("Wrong input, sides must be a positive number larger than 2");
			return get_sides();
		}
		return sides;
	}
	public static int getDegree()
	{
		System.out.println("Enter degree");
		int degree = reader.nextInt();
		if(degree<=0)
		{
			System.out.println("Wrong input, dgree must be a positive number larger or equal to 0");
			return get_sides();
		}
		return degree;
	}

	
}


