import java.util.Scanner;
import Turtle.Turtle;
public class Army extends Turtle {
	static Scanner reader = new Scanner(System.in);
	public static void main(String[] args) {
		Turtle[]Army=build_your_army();
		put_army_in_line(Army);
		army_moves_together55(Army);
		army_changes_angle(Army);
		army_moves_together80(Army);
		army_draws_hexagon(Army);
		hide_turtles(Army);
	}
	public static void put_army_in_line(Turtle[]Army) {//Put the army in line with a equals spaces.
		for(int i=1;i<=4;i++)
		{
			Army[i].tailUp();
			if(!put_kind_of_drunk_in_line(Army,i) && ! put_kind_of_Intelligent_in_line(Army,i))
			{
				Army[i].turnRight(90);
				Army[i].moveForward(120*i);
				Army[i].turnLeft(90);
			}
			Army[i].tailDown();
			Army[0].tailDown();
		}

	}
	public static boolean put_kind_of_drunk_in_line(Turtle[] Army,int i)//Put the kind of drunk turtles in line(Grumpy,Drunk)
	{
		if(Army[i] instanceof GrumpyTurtle)
		{
			Army[i].turnRight(90);
			((GrumpyTurtle)Army[i]).move_sahi(120*i);
			Army[i].turnLeft(90);
			return true;
		}
		else if(Army[i] instanceof DrunkTurtle)
		{
			((DrunkTurtle)Army[i]).turnRightSahi(90);
			((DrunkTurtle)Army[i]).move_sahi(120*i);
			((DrunkTurtle)Army[i]).turnLeftSahi(90);
			return true;
		}
		return false;
	}
	public static boolean put_kind_of_Intelligent_in_line(Turtle[] Army,int i)//Put the kind of intelligent turtles in line(intelligent,Burmese)
	{
		if(Army[i] instanceof JumpyTurtle)
		{
			Army[i].turnRight(90);
			((JumpyTurtle) Army[i]).move_to_line(120*i);
			Army[i].turnLeft(90);
			return true;
		}else if(Army[i] instanceof BurmeseTurtle)
		{
			Army[i].turnRight(90);
			((BurmeseTurtle)Army[i]).move_to_line(120*i);
			Army[i].turnLeft(90);
			return true;
		}
		return false;
	}
	public static Turtle[] build_your_army()//Build the army.
	{
		Turtle []Army=new Turtle [5];
		for(int i=0;i<5;i++)
		{
			Army[i]=choose_kind_of_turtle();
			Army[i].tailUp();
		}
		return Army;
	}
	public static Turtle choose_kind_of_turtle() //The user choose the turtles.
	{
		show_the_options();
		int number=insert_number();
		if(number%2==0)
		{
			return insert_kind_of_IntelligentTurtle(number);
		}
		return insert_others(number);
	}
	public static Turtle insert_kind_of_IntelligentTurtle(int number)//Insert the kind of Intelligent Turtle(Intelligent,Jumpy,Burmese)
	{
		if(number==2)
		{
			return new IntelligentTurtle();
		}
		if(number==4)
		{
			return new JumpyTurtle();
		}
		return new BurmeseTurtle();
	}
	public static Turtle insert_others(int number)//Insert the not Intelligent Turtle(Turtle,Drunk,Grumpy)
	{
		if(number==1) 
		{
			return new Turtle();
		}
		if(number==3)
		{
			return new DrunkTurtle();
		}
		return new GrumpyTurtle();
	}

	public static void show_the_options() {//Print the option for the user.
		System.out.println("Choose the type of a turtle");
		System.out.println("1. Simple");
		System.out.println("2. Intelligent");
		System.out.println("3.Drunk");
		System.out.println("4.Jumpy");
		System.out.println("5.Grumpy");
		System.out.println("6.Burmese");
	}
	public static int insert_number() {//Get the user from the user.
		int number=reader.nextInt();
		if(number<1 || number>6)
		{
			System.out.println("Invalid Input, Please Try Again");
			show_the_options();
			insert_number();
		}
		return number;
	}
	public static void army_moves_together55(Turtle[]Army)//Move all the turtles 55 forward.
	{
		for(int i=0;i<5;i++)
		{
			Army[i].moveForward(55);
		}
	}
	public static void army_changes_angle(Turtle[]Army)//Make all the turtles turn 45 degrees left together. 
	{
		for(int i=0;i<5;i++)
		{
			Army[i].turnLeft(45);
		}
	}
	public static void army_moves_together80(Turtle[]Army)//Move all the turtles 80 forward.
	{
		for(int i=0;i<5;i++)
		{
			Army[i].moveForward(80);
		}
	}
	public static void army_draws_hexagon(Turtle[]Army)//The turtles that can draw a hexagon.
	{
		for(int i=0;i<5;i++)
		{
			if((Army[i] instanceof BurmeseTurtle))
			{
				((BurmeseTurtle)Army[i]).moveForward(6,26);
			}
			else if (Army[i] instanceof JumpyTurtle) 
			{
				((JumpyTurtle)Army[i]).draw(6,26);
			}
			else if (Army[i] instanceof IntelligentTurtle){

				((IntelligentTurtle)Army[i]).draw(6,26);
			}
		}
	}
	public static void hide_turtles(Turtle[]Army)//Hide the turtles at the end.
	{
		for(int i=0;i<5;i++)
		{
			Army[i].hide();
		}
	}
}

