import java.util.Scanner;

import java.util.Arrays;

class SortNames{

	public static void main(String [] args){

		Scanner sc = new Scanner(System.in);

		System.out.print("Enter the number of names you want to enter: ");

		int n = sc.nextInt();

		System.out.print("Enter the names: ");

		String [] arr = new String[n];

		for(int i=0;i<n;i++){

			arr[i] = sc.next();

		}

		Arrays.sort(arr);

		System.out.print("Sorted names:");

		for(int i =0;i<n;i++){

			System.out.print(arr[i]+" ");

		}

	}

}
