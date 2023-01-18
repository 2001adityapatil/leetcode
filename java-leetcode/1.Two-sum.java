Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.

You may assume that each input would have exactly one solution, and you may not use the same element twice.

You can return the answer in any order.

Example 1:

Input: nums = [2,7,11,15], target = 9
Output: [0,1]
Explanation: Because nums[0] + nums[1] == 9, we return [0, 1].
Example 2:

Input: nums = [3,2,4], target = 6
Output: [1,2]
Example 3:

Input: nums = [3,3], target = 6
Output: [0,1]


Solution 1: we can use brute force using two for loop.
Solution 2: using the hashmap we can iterate over the array and check for the difference between target and the element retrieve from array is available or not in the 
            map if not adding the pair in the map if we found the difference for sure then we adding in the indexes in the res array and returning it.


class Solution{
    int[] twoSum(int[] nums,int target)
	{
		HashMap<Integer, Integer> hp = new HashMap<Integer, Integer>();
		// for(int i=0; i < nums.length; i++)
		// {
		// }
		int[] res = new int[2];
		for(int i = 0; i < nums.length; i++)
		{
			if(hp.containsKey(target - nums[i]))
			{
				res[0] = i;
				res[1] = hp.get(target - nums[i]);
				break;
			}
			hp.put(nums[i], i);
		}
		return res;

	}
}
