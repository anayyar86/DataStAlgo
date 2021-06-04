package practice;

import java.util.Arrays;

public class ProdArray {

	public static void main(String[] args) {

		int a []= {2,3,5};

		// Output should be {15,10,6}

		bruteForceProdArray (a);
		optimizeProdArray(a);
		optimizeProdArrayWithoutExtraArrays(a);


	}



	// Big O is o(n^2)

	public static int[] bruteForceProdArray(int a [])
	{
		int m=1;
		int prod[]= new int[a.length];


		for (int i=0; i<a.length;i++)
		{

			for (int j=0; j<a.length;j++)
			{
				if (a[i]!= a[j])
				{
					m = m* a[j];
				}

			}
			prod[i]= m;
			m=1;

		}
		System.out.println(Arrays.toString(prod));
		return prod;

	}


	// Big O is o(n+n=2n) since 2 is constant so its o(n)

	public static int[] optimizeProdArray(int a [])

	{
		int m=1;
		int  prod[]= new int [a.length];
		int l[] = new int [a.length];
		int r[]= new int [a.length];
     
		for (int i=0;i<a.length;i++)
		{
			l[i]= m;
			m= m*a[i];                               // l = 1,2,6
		}

		m =1;

		for (int i=a.length-1;i>=0;i--)
		{
			r[i]= m;
			m= m*a[i];                              // r = 15,5,1
		}

		for (int j=0;j<a.length;j++)
		{
			prod[j]= l[j]*r[j];
		}

		System.out.println(Arrays.toString(prod));
		return prod;
	}


	// More Optimization by removing extra arrays

	public static int[] optimizeProdArrayWithoutExtraArrays(int a [])

	{
		int m=1;
		int  prod[]= new int [a.length];

		for (int i=0;i<a.length;i++)
		{
			prod[i]= m;
			m= m*a[i];
		}

		m =1;

		for (int i=a.length-1;i>=0;i--)
		{
			prod[i]=prod[i]*m;
			m= m*a[i];
			;
		}


		System.out.println(Arrays.toString(prod));
		return prod;
	}



}
