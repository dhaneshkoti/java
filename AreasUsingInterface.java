import java.util.Scanner;

interface GeometricShape{

	void area();

	void perimeter();

}

class Triangle implements GeometricShape{

	int s1,s2,s3;

	Triangle(){

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter lengths of the three sides of Triangle:");

		s1 = sc.nextInt();

		s2 = sc.nextInt();

		s3 = sc.nextInt();

		}

	public void area(){

		double s = (s1+s2+s3)/2.0;

		System.out.println("Area of Triangle:"+s);

	}

	public void perimeter(){

		System.out.println("Perimeter of Triangle:"+((double)s1+s2+s3));

	}

}

class Rectangle implements GeometricShape{

	double l,b;

	Rectangle(){

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter length and breadth of Rectangle:");

		l = sc.nextDouble();

		b = sc.nextDouble();
    }

	public void area(){

		System.out.println("Area of Rectangle:"+(l * b));

	}

	public void perimeter(){

		System.out.println("Perimeter of Rectangle:"+(2 *(l+b)));

	}

}

class Circle implements GeometricShape{

	double r;

	Circle(){

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter radius of Circle:");

		r = sc.nextDouble();

	}

	public void area()

	{

		System.out.println("Area of Circle:"+(Math.PI * r * r));

	}

		public void perimeter()

	{

		System.out.println("Circumference of Circle:"+(Math.PI * 2 * r));

	}

}

class ExecuteMain{

	int choice(){

		Scanner sc = new Scanner(System.in);

		System.out.println("Choose a geometric shape:\n1.Triangle\n2.Rectangle\n3.Circle\nEnter your choice:");
    int a= sc.nextInt();

		return a;

	}

	public static void main(String [] args){

		ExecuteMain em = new ExecuteMain();

		int ch = em.choice();

		switch(ch){

			case 1:

				Triangle t = new Triangle();

				t.area();

				t.perimeter();

				break;

			case 2:

				Rectangle r1 = new Rectangle();

				r1.area();

				r1.perimeter();

				break;

			case 3:

				Circle c = new Circle();

				c.area();

				c.perimeter();

				break;

			default:

				System.out.println("Invalid choice");

		}

	}

}
