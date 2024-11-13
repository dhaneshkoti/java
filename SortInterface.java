package sortapp.subsortapp;
import sortapp.*;
public class SortImpl implements SortInterface
	{
		public void sort(int arr[],int n)
		{
			int i,j;
			for(i=0;i<n;i++)
				{
					for(j=0;j<n-i-1;j++)
						{
							if(arr[j]>arr[j+1])
							{
								int t=arr[j];
								arr[j]=arr[j+1];
								arr[j+1]=t;
							}
						}
				}
			System.out.println("linear sort is used");
			System.out.print("Sorted Numbers:[");
			for(i=0;i<n-1;i++)
				System.out.print(+arr[i]+", ");
			System.out.print(+arr[i]);
			System.out.println("]");
		}
	}

searchingapp/SearchInterface.java
package searchingapp;
public interface SearchInterface
	{
		void search(int arr[],int se,int n);
	}
package searchingimpl;
import searchingapp.*;
public class SearchImpl implements SearchInterface
	{
		public void search(int arr[],int se,int n)
		{
			int i,c=0;
			for(i=0;i<n;i++)
				{
					if(arr[i]==se)
					{
						c=4;
						break;
					}
				}
			if(c==4)
				System.out.println("Element "+se+" found");
			else
				System.out.println("Element "+se+" not found");
		}
	}

ExecutePackage.java
import sortapp.subsortapp.*;
import searchingimpl.*;
import java.util.*;
class ExecutePackage
	{
		public static void main(String z[])
		{
			Scanner s=new Scanner(System.in);
			System.out.print("Enter the number of elements:");
			int n=s.nextInt();
			int arr[]=new int[40];
			for(int i=0;i<n;i++)
				{
					System.out.print("Enter element "+(i+1)+":");
					arr[i]=s.nextInt();
				}
			SortImpl s1=new SortImpl();
			s1.sort(arr,n);
			System.out.print("Enter the element to search:");
			int se=s.nextInt();
			SearchImpl p=new SearchImpl();
			p.search(arr,se,n);
		}
	}
