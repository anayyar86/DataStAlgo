package practice;

import java.util.Arrays;

public class MergeTwoSortedArray {

	public static void main(String[] args) {
		
		// Big O(n)
		
		int a[] = {1,3,5};
		int b[] = {2,6,7};
		
		mergeArray(a,b);

	}
	
	
	public static int[] mergeArray(int []a, int []b)

	{
		int i=0; // array a
		int j=0;  // array b
		int k =0;// result
		
		int [] result = new int [a.length+b.length];   // merging both arrays
		
		while (i<a.length && j<b.length)
			
		{
			if (a[i]>b[j])
			
			{
				result[k]= b[j];
				k++;
				j++;
			}
			else
			{
				result[k]= a[i];
			    k++;
			    i++;
			}
			
		}
		
		while (i<a.length)                         // we need to get the last value of the array
		{
			result[k]= a[i];
			k++;
			i++;
		}
		
		while (j<b.length)                         // we need to get the last value of the array
		{
			result[k]= b[j];
			k++;
			j++;
		}
		System.out.println(Arrays.toString(result));
		 return result;
				
		
	}
}
