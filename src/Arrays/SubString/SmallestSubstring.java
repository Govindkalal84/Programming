package Arrays.SubString;

import java.util.Scanner;

public class SmallestSubstring {   ////smallest substring with sum=k;

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("r");
		int n=sc.nextInt();
		
		int[] arr=new int[n];
		for(int i=0;i<n;i++)
		{
			arr[i]=sc.nextInt();
		}
		int k=sc.nextInt();
		
		ntg(arr,k);
		
	}
	  static void ntg(int[] arr,int k)
	  {
		  int minlen=Integer.MAX_VALUE;
		  int strI=-1;
		  
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
						 strI=i;
					 }
				 }
			 }
		  }
		  if(strI==-1)
		  {
			  System.out.print("not found");
		  }
		  else
		  {
			  for(int i=strI;i<strI+minlen;i++)
			  {
				  System.out.print(arr[i]+" ");
			  }
		  }
	  }

}


//r
//6
//2 3 1 2 3 4
//7
//3 4 
