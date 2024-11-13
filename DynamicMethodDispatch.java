import java.util.Scanner;

class Rectangle {
	
	// Write your code here...
	void area(){

		int l,b;

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter length and width of Rectangle:");

		l = sc.nextInt();

		b = sc.nextInt();

		System.out.println("Area of rectangle:"+(l*b));

	}
}

class Square extends Rectangle {
	
	// Write your code here...
	void area(){

		Scanner sc = new Scanner(System.in);

		int s;

		System.out.println("Enter side of square:");

		s = sc.nextInt();

		System.out.println("Area of square:"+(s*s));

	}
}

class Triangle extends Rectangle {
	
	// Write your code here...
	void area(){

		Scanner sc = new Scanner(System.in);

		int b,h;

		System.out.println("Enter base and height of Traingle:");

		b = sc.nextInt();

		h  = sc.nextInt();

		System.out.println("Area of triangle:"+(int)((0.5) * b * h));
    }
}

class Calculation {
    public static void main(String args[]) {


			Rectangle r = new Rectangle();

			Square s = new Square();

			Triangle t = new Triangle();

			r.area();

			s.area();

			t.area();

		}
    	// Write your code here...
	
}
