import java.util.Scanner;
class TablePrinter implements Runnable {
}
public class Main {
}
*/
package q17211;
import java.util.Scanner;
class Main{
	public static void main(String args[])
	{
	int n;
	Scanner s =new Scanner(System.in);
	System.out.println("Enter the number of tables:");
		n=s.nextInt();
		for(int i=1;i<=10;i++)
		{
			for(int j=1;j<=n;j++)
				{
					 System.out.println(j+" * "+i+" = "+(j*i));
				}
		}
}
}
