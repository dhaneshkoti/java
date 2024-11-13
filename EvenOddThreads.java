import java.util.Scanner;
class Main{
	public static void main(String args[])
	{
	
		//System.out.println("Enter the maximum even number: ")
		//System.out.println("Enter the maximum odd number: ");
		int even,odd,i,j;
		Scanner s=new Scanner(System.in);
       System.out.print("Enter the maximum even number:");
		even=s.nextInt();
       System.out.print("Enter the maximum odd number:");
		odd=s.nextInt();
        for (j=1;j<=odd;j++)
			{
				if(j%2!=0){
					System.out.println("Odd:"+j);
				}
			}
				
		        for(i=2;i<=even;i++)
		        {
		        	if((i%2)==0)
					{
		        	System.out.println("Even:"+i);
					}
				}
        	
        }
}
