package practice;



public class RunLengthEncoding {

	public static void main(String[] args) {

		String input = "abbc";          // Output should be "a1b2c1"

		GetRLE(input);

	}

	public static String GetRLE (String str)

	{
		StringBuilder result = new StringBuilder();
		int counter= 1;

		char []arr = new char[str.length()];

		arr = str.toCharArray();

		char currentChar = arr[0];

		for (int i =1; i<str.length();i++)
		{
			if (currentChar==arr[i])
			{
				counter=counter+1;

			}
			else
			{
				result.append(String.valueOf(currentChar)+counter);

				currentChar= arr[i];
				counter=1;

			}
		}
		result.append(String.valueOf(currentChar)+counter);

		//  This code is to compare the length of the output to the input 
		/*
		 * if (result.length()>=str.length()) { System.out.println(str); return str; }
		 * else
		 */
		System.out.println(result.toString());
		return result.toString();


	}



}
