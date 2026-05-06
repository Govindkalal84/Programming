package Map;

import java.util.LinkedHashMap;
import java.util.Scanner;
import java.util.Set;

public class MapArrayPairs {
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("r");
		int n=sc.nextInt();
		
		int[] arr=new int[n];
	for(int i=0;i<arr.length;i++)
	{
	    arr[i]=sc.nextInt();	
	}
	
	
	pairs(arr);
	}
	
	static void pairs(int[] arr)
	{
		LinkedHashMap<Integer, Integer> map=new LinkedHashMap<Integer,Integer>();
		
		for(int i=0;i<arr.length;i++)
		{
			if(map.containsKey(arr[i]))
			{
				int c=map.get(arr[i]);
				map.put(arr[i],c+1);
			}
			else
			{
				map.put(arr[i], 1);
			}
		}
		Set<Integer> keys=map.keySet();
		for(int x:keys)
		{
			System.out.println(x+" "+map.get( x));
		}
	}
}

