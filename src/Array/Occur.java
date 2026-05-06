package Array;

import java.util.Scanner;

public class Occur {
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("r");
		int n=sc.nextInt();
		
		int[] arr =new int[n];
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=sc.nextInt();
		}
		ntg(arr);
	}
	 
	 static void ntg(int[] arr)
	 {
		 
		 int count=1; int max=0; int res=arr[0];
		 
		 for(int i=0;i<arr.length-1;i++)
		 {
			 
			 if(arr[i]==arr[i+1])
			 {
				 count++;
				 
			 }
			 else
			 {
				 if(count>max)
				 {
					 max=count;
					 res=arr[i];
				 //System.out.println(arr[i]+" "+count);
				 }
				 count=1;
			 }
		 }
		 if(count>max) {
			 
			 max=count;
			 res=arr[arr.length-1];
		 //System.out.println(arr[arr.length-1]+" "+count);
		 }
		 System.out.println(max+" "+res);
	 }

}
