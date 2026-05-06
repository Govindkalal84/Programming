package Substring;

import java.util.Scanner;

public class Smalles {   ///smallest subarray with sum  equal to k

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("r");
		 int n=sc.nextInt();
		 
		 int[] arr=new int[n];
		 for(int i=0;i<arr.length;i++)
		 {
			 arr[i]=sc.nextInt();
		 }
		 int k=sc.nextInt();
		 
		 ntg(arr,k);
	}
	static void ntg(int[] arr,int k)
	{
		int minlen=Integer.MAX_VALUE;
		int stri=-1;
		
		for(int i=0;i<arr.length;i++)
		{
			int sum=0;
			for(int j=i;j<arr.length;j++)
			{
				sum+=arr[j];
				if(sum==k)
				{
					int len=j-i+1;
					if(len<minlen)
					{
						minlen=len;
						stri=i;
					}
				}
			}
		}
		if(stri==-1)
		{
			System.out.print("");
		}
		
		else
		{
			for(int i=stri;i<stri+minlen;i++)
			{
				System.out.print(arr[i]+" ");
			}
		}
	}
	}