package Map;

import java.util.Scanner;
import java.util.HashSet;

public class Duplicate {
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("r");
		int n=sc.nextInt();
		
		int[] arr=new int[n];
		for(int i=0;i<n;i++)
		{
			arr[i]=sc.nextInt();
		}
		
		ntg(arr);		
	}
	static void ntg(int[] arr)
	{
		 HashSet<Integer> set=new HashSet<Integer>();
		 
		 for(int i=0;i<arr.length;i++)
		 {
			 set.add(arr[i]);
		 }
		 for(int x:set)
		 {
			 System.out.println(x);
		 }
	}

}
