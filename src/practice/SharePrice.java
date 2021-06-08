package practice;

public class SharePrice {

	public static void main(String[] args) {
		
		int arr[] = {6,7,1,2,5,3,9,3};
		
		
		maxProfit(arr);
		

	}
	
	public static int maxProfit(int [] arr)
	{
		
		int buyPrice= arr[0];
		int profit =0;
		
		for (int i=1;i<arr.length;i++)
		{
			if (buyPrice>arr[i])
			{
				buyPrice= arr[i];
			}
			
			else if (arr[i]-buyPrice>profit)
			{
				profit = (arr[i]- buyPrice);
			}
		}
		
		System.out.println(profit);
		
		return profit;
		
	}

}
