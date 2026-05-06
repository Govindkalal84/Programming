package Array;

import java.util.Scanner;
import java.util.Stack;

public class Validation {
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("r");
		String str=sc.nextLine();
		
	boolean res=	ntg(str);
	System.out.println(res);
		
	}
    static boolean ntg(String str)
    {
    	
    	  Stack<Character> st=new Stack<Character>();
    	  
    	  for(char ch: str.toCharArray())
    	  {
    		  if(ch=='['||ch=='{'||ch=='(')
    		  {
    			  st.push(ch);
    		  }
    		  else
    		  {
    			  if(st.isEmpty())
    				  return false;
    			   
    			    char top=st.pop();
    			    
    			    if(ch=='}'&&top!='{')
    			    	return false;
    			    if(ch==']'&&top!='[')
    			    	return false;
    			    if(ch==')'&&top!='(')
    			    	return false;
    			    
    			  
    		  }
    	  }
    	
    	
    	
    	
    	return st.isEmpty();
    }
}
