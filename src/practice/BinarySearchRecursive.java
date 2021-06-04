package practice;

public class BinarySearchRecursive {

	public static void main(String[] args) {
		
		
		// big o : O(logn) 
		
		// To find the element in the array i.e. 9 
		int x = 9;
		int arr[]= {1,3,5,9,10};
		
		binarySearch(arr,x,0,arr.length-1);
	
	}
		public static boolean binarySearch (int arr[],int x,int l, int r)
		{
			int m = (l+r)/2;
			
		
			if (l>r)
			{
			return false;	
			}
		
		    if (arr[m]==x)
		    {
		    	System.out.println(arr[m]);
		    	return true;
		    }
		    if (arr[m]>x)
		    {
		    	
		  return binarySearch(arr,x,l,m-1);  
		    }
		    else
		    {	
		   return  binarySearch(arr,x,m+1,r);
		   
		    }
		}
}
	

