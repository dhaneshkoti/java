import java.util.Scanner;
class PrintPrime
{
	public static void main(String args[])
	{
		int i,j,n,count=0;
		Scanner s = new Scanner(System.in);
		System.out.print("Enter a number: ");
		n = s.nextInt();
		System.out.print("Prime numbers are:");
		for(j = 2;j <= n;j++)
		{
			for(i = 1,count = 0;i <= j;i++)
			{
				if(j%i==0)
				{
					count++;
				}
			}
			if(count==2)
			{
			System.out.print(" "+j);
			}
		}
		System.out.print(" ");
	}
}
