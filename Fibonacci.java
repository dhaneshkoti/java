import java.io.*;
import java.util.*;
class Main
	{
		public static void main(String args[])
		{
			Scanner s = new Scanner(System.in);
			int i,j,a=0,b=1,c=0,n;
			System.out.print("Enter the number up to which you want to print the Fibonacci sequence:");
			n=s.nextInt();
			if(n<=0)
				System.out.println("Invalid number");
			else
			{
				System.out.print("Fibonacci sequence up to "+n+":\n");
				System.out.print(a+" ");
				System.out.print(b+" ");
				for(i=0;i<n-2;i++)
					{
						c=a+b;
						a=b;
						b=c;
						if(c>n)
							break;
						System.out.print(c+" ");
					}
			}
		}
	}
