import java.util.Scanner;
class Main
	{
		public static void main(String args[])
		{
			String s,d="";
			int l;
			Scanner sc=new Scanner(System.in);
			System.out.print("Enter a string:");
			s=sc.nextLine();
			l=s.length();
			for(int i=l-1;i>=0;i--)
				{
					d=d+s.charAt(i);
				}
			if(s.equals(d))
			{
				System.out.println("Palindrome");
			}
			else
			{
				System.out.println("Not Palindrome");
			}
		}
	}
