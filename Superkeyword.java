import java.util.*;
class vehicle
	{
		String c;
		int year;
		vehicle(String x,int y)
		{
			c=x;
			year=y;
		}
		void show()
		{
			System.out.println("Displaying Car Information:");
			System.out.println("Name:"+c);
			System.out.println("Year:"+year);
		}
	}
class car extends vehicle
	{
		int z;
		car(String x,int y){
			super(x,y);
		}
		void start()
		{
			System.out.println("Starting Car Engine:");
			System.out.println("Engine started");
			System.out.println("Car engine started");
		}
	}
class Main
	{
		public static void main(String args[])
		{
			System.out.print("Enter the car name:");
			Scanner sc=new Scanner(System.in);
			String c=sc.nextLine();
			System.out.print("Enter the year of car:");
			int y=sc.nextInt();
			car ch=new car(c,y);
			ch.show();
			ch.start();
		}
	}
