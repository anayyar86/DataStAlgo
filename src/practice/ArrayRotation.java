package practice;

import java.util.Arrays;

public class ArrayRotation {

	public static void main(String[] args) {


		int [] arr = {9,4,5,7};     //Output should be 5,7,9,4

		int d =2;

		bruteForceRotateArray(arr,d);
		optimizeArrayRotate(arr,d);

	}



	//  Big o is o(n)x d times

	public static void bruteForceRotateArray(int arr[],int d) {


		{
			for (int i=0;i<d;i++)
			{
				int temp= arr[0];
				for (int j =0;j<arr.length-1;j++)

				{
					arr[j]=arr[j+1];

				}
				arr[arr.length-1]= temp;
			}

			System.out.println(Arrays.toString(arr));

		}
	}






	// Big o is o(n)

	public static void optimizeArrayRotate(int[] nums, int k) {

		int[] a = new int[nums.length];

		for (int i = 0; i < nums.length; i++) 
		{
			a[(i + k) % nums.length] = nums[i];    


		}

		for (int i = 0; i < nums.length; i++) 
		{
			nums[i] = a[i];
		}
		System.out.println(Arrays.toString(nums));

	}
}
