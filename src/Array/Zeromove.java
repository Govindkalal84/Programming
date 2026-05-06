package Array;

import java.util.Scanner;

public class Zeromove {                          
	public static void main(String[] args) {    
		Scanner sc=new Scanner(System.in);
		System.out.println("r");
		int n=sc.nextInt();
		
		int[] arr=new int[n];
		for(int i=0;i<arr.length;i++)
		{                                                         
			arr[i]=sc.nextInt();
		}
		ntg(arr);
		for(int i=0;i<arr.length;i++)
		{
			System.out.println(arr[i]);
		}
	}
         static void ntg(int[] arr)
         {
        	 int i=0;
        	 int j=0;
        	 while(i<arr.length)
        	 {
        		 if(arr[i]==0)
        		 {
        			 i++;
        		 }
        		 else
        		 {
        			 arr[j]=arr[i];
        			 i++;
        			 j++;
        		 }
        	 }
        	 while(j<arr.length)
        	 {
        		 arr[j]=0;
        		 j++;
        	 }
        	 
         }
}
//r
//10
 //1 2 0 3 0 4 0 5 0 6
//1
//2
//3
//4
//5
//6
//0
//0
//0
//0


