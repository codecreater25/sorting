package sorting;

import java.util.Scanner;

public class Bubblesort {
	public void sort(int a[])
	{
		int temp;
		for(int i=0;i<a.length;i++)
		{
			for(int j=i;j<a.length;j++)
			{
				if(a[i]<a[j])
				{
					temp=a[i];
					a[i]=a[j];
					a[j]=temp;
					
				}
			}
			
		}
		
		for(int i=0;i<a.length;i++)
		{
			System.out.println(a[i]);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("enter 10 elements to sort");
		int a[];
		a=new int[10];
		Scanner in = new Scanner(System.in);
		for(int i=0;i<a.length;i++)
		{
			a[i]=in.nextInt();
		}
		Bubblesort obj = new Bubblesort();
		obj.sort(a);
		in.close();
		

	}

}
