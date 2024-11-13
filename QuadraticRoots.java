import java.io.*;
import static java.lang.Math.sqrt;
import java.util.*;
class QuadraticRoots
{
	void findroots(double a,double b,double c)
	{
		double d,root1,root2;
		d = b*b - 4*a*c;
		if(d>0)
		{
			root1=(-b+sqrt(d))/(2*a);
			root2=(-b-sqrt(d))/(2*a);
			System.out.print("First root is : "+root1+" Second root is : "+root2);
		}
		else if(d==0)
		{
			root1=root2= -b/(2*a);
			System.out.print("Roots are equal and value is : "+root1);
		}
		else if(d<0)
		{
			System.out.print("Roots are imaginary");
		}
	}
	public static void main(String args[])
	{
		double a,b,c;
		QuadraticRoots r1 = new QuadraticRoots();
		a = Double.parseDouble(args[0]);
		b = Double.parseDouble(args[1]);
		c = Double.parseDouble(args[2]);
		r1.findroots(a,b,c);
	}
}
