package Map;

import java.util.LinkedHashMap;
import java.util.Scanner;
import java.util.Set;

public class Map {
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("r");
		String str=sc.nextLine();
		
		CountWord(str);
		
	}
	static void CountWord(String str)
	{
		LinkedHashMap<Character, Integer> map=new LinkedHashMap<Character, Integer>();
		
		for(int i=0;i<str.length();i++)
		{
			char ch=str.charAt(i);
			
			if(map.containsKey(ch))
			{
				int count=map.get(ch);
				map.put(ch, count+1);
			}
			else
			{
				map.put(ch, 1);
			}
		}
		
		
		String t="";
		Set<Character> keys=map.keySet();
		
		for(char key:keys)
		{
		t=t+key+" "+map.get(key);
		}
		System.out.println(t);
		
	}

}
