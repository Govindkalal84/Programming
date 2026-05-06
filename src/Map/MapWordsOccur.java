package Map;

import java.util.HashMap;
import java.util.Scanner;
import java.util.Set;

public class MapWordsOccur {
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("r");
		String str=sc.nextLine();
		
		Words(str);
		
	}
	static void Words(String str)
	{
		HashMap<String, Integer> map=new HashMap<String,Integer>();
		String[] arr=str.split(" ");
		
		for(int i=0;i<arr.length;i++)
		{
			if(map.containsKey(arr[i]))
			{
				int c=map.get(arr[i]);
				map.put(arr[i], c+1);
			}
			else
			{
				map.put(arr[i], 1);
			}
		}
		
		Set<String> keys=map.keySet();
		
		for(String s:keys)
		{
			int value=map.get(s);
			
			if(value>3)
			{
				System.out.println(s+" "+value);
			}
		}
		
		
	}

}
