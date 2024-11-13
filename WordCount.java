import java.util.Scanner;
class WordCount
	{
		public static void main(String args[])
		{
			String s;
			int count=1,l;
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter the text:");
			s=sc.nextLine();
			l=s.length();
			if(l==0)
				System.out.println("Please enter valid text");
			else
			{
				for(int i=0;i<l;i++)
					if(s.charAt(i)==' ')
						count++;
				System.out.println("Number of words in the text:"+count);
			}
		}
	}
