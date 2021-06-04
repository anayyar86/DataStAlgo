package practice;

import java.util.Arrays;

public class BubbleSort {

	public static void main(String[] args) {


		int arr[] = {8,10,3,9};

		sorting(arr);
	}



	public static int[] sorting (int arr[])
	{

		for (int i=0;i<arr.length-1;i++)
		{
			for (int j=0;j<arr.length-i-1;j++)

			{
				if (arr[j]>arr[j+1])
				{
					swap(arr,j,j+1);
				}

			}
		}
		System.out.println(Arrays.toString(arr));
		return arr;
	}



	public static void swap(int []a,int l, int r)
	{
		int temp = a[l];
		a[l]= a[r];
		a[r]= temp;


	}
}