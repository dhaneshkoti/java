import java.util.Scanner;
class Main{
	public static void main(String args[])
	{
		Scanner s =new Scanner(System.in);
		double ib,wa,b=0;
		double ac;
		System.out.print("Enter account number:");
		ac=s.nextDouble();
		System.out.print("Enter initial balance:");
		ib=s.nextDouble();
		System.out.print("Enter withdrawal amount:");
		wa=s.nextDouble();
		if (wa<=ib && ib-wa>100){
			ib=ib-wa;
			System.out.println("Withdrawn:"+wa);
		    System.out.println("New Balance:"+ib);
		}
	else{
		System.out.println("Error:Insufficient Fund Exception");
	}
	}
}
