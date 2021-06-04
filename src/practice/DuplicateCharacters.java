package practice;

import java.util.Arrays;

public class DuplicateCharacters {

	public static void main(String[] args) {


		String str = "abcbff";

		bruteForceIsDuplicate (str);
		optimizeIsDuplicateUisngArray (str);
		optimizeIsDuplicateUsingSort (str);

	}

	// BRUTE-FORCE  BIG O = N^2

	public static boolean bruteForceIsDuplicate(String x) 
	{ 
		char character = 0; 

		for (int i=0; i<x.length();i++)

		{ 
			for (int j=i+1; j<x.length();j++) 
			{ 
				if (x.charAt(i)==x.charAt(j)) 
				{ 
					character= x.charAt(i); 
					System.out.println("Duplicate character is " +character ); 
					return true; 
				}					 

			}

		}  
		return false;
	}



	// Using Array  Big 0 -- 0(1)

	public static boolean optimizeIsDuplicateUisngArray (String input)

	{

		boolean items[] = new boolean [256];

		for (int i=0; i<input.length();i++)
		{
			char c = input.charAt(i);
			int a = (int)c;
			if (items[a]) 
			{
				System.out.println("Duplicate character is " +c ); 
				return true;
			}
			items[a]=true;

		}

		return false;


	}

	// Using sort // Using Array  Big 0 -- 0(n)

	public static boolean optimizeIsDuplicateUsingSort (String input)
	{

		char [] arr = new char[input.length()];
		arr= input.toCharArray();

		Arrays.sort(arr);

		System.out.println(Arrays.toString(arr));

		for (int i=0; i<arr.length;i++)

		{
			if (arr[i]==arr[i+1])
			{
				System.out.println("Duplicate character is " + arr[i]);

				return true;
			}

		}	    
		return false;		
	}

}