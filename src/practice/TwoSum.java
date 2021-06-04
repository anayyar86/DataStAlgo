package practice;


import java.util.HashMap;



public class TwoSum {

	public static void main(String[] args) {

		int nums[] = {4,2,2};
		int target = 4;

		//Output should be [1,2]

		bruteForceTwoSum(target,nums);
		optimizeTwoSum(target,nums);

	}

	// Big o is o(n^2) 

	public static int[] bruteForceTwoSum(int target,  int nums[])

	{


		for (int i=0;i<nums.length;i++)
		{
			for (int j=i+1;j<nums.length;j++)
			{
				if (nums[i]+nums[j]==target)
				{

					System.out.println(i + "-----"+ j);

					return new int [] {i,j};
				}
			}
		}
		throw new IllegalArgumentException("No two sum solution"); // Used to indicate when illegal argument is passed. 
	}




	// Using 1 hashtable   // Big o is  o(n)


	public static int[] optimizeTwoSum (int target,int[] nums) {


		HashMap<Integer, Integer> map = new HashMap<>();

		for (int i = 0; i < nums.length; i++) {

			int complement = target - nums[i];

			if (map.containsKey(complement)) 
			{
				System.out.println(map.get(complement)+"---"+i);

				return new int[] {map.get(complement),i};
			}

			map.put(nums[i], i);
		}

		throw new IllegalArgumentException("No two sum solution");
	}

}
