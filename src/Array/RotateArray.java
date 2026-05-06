package Array;

import java.util.Scanner;

public class RotateArray {
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("r");
		int n=sc.nextInt();
		int k=sc.nextInt();
		
		int[] arr=new int[n];
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=sc.nextInt();
		}
		k=k%n;
		
		reverse(arr,0,n-1);
		
		reverse(arr,0,k-1);
		
		reverse(arr,k,n-1);
		
		for(int res: arr)
		{
			System.out.println(res);
		}
		
		
	}
	
	static void reverse(int[] arr,int i,int j)
	{
		
		while(i<j)
		{
			int temp=arr[i]; 
			arr[i]=arr[j];
			arr[j]=temp;
			i++;
			j--;
		}
	}

}
