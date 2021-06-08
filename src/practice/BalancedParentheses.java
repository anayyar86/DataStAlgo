package practice;

import java.util.Hashtable;
import java.util.Stack;

public class BalancedParentheses {

	public static void main(String[] args) {
		
		String str= "[({()})[]}";
		
		isValid(str);
	}

	
	public static boolean isValid (String input)
	{
		Hashtable <Character,Character> ht = new Hashtable<>();
		ht.put(')', '(');
		ht.put('}', '{');
		ht.put(']','[');
		
		
		Stack<Character> st = new Stack<>();
		
		
		for (int i =0;i<input.length();i++)
		{	
			
			if (ht.containsKey((input.charAt(i))))
			{
	
				if (!st.isEmpty())
				{
				char c = st.pop();
				
				System.out.println(ht.get(input.charAt(i)));
				
				if (c == ht.get(input.charAt(i)))
					continue;
				else
					System.out.println("false");
					return false;
				}
					
			}
		
			else 
				st.push(input.charAt(i));
	}
		System.out.println(st.isEmpty());
		return st.isEmpty();
				
				
		
	}
}
