// Given an integer array nums, return an array answer such that answer[i] is equal to the product of all the elements of nums except nums[i].

// The product of any prefix or suffix of nums is guaranteed to fit in a 32-bit integer.

// You must write an algorithm that runs in O(n) time and without using the division operation.

// Example 1:

// Input: nums = [1,2,3,4]
// Output: [24,12,8,6]
// Example 2:

// Input: nums = [-1,1,0,-3,3]
// Output: [0,0,9,0,0]

// Solution 1: we can solve this using the prefix and postfix logic lets say we have input array nums as {1,2,3,4} keep the prefix value as 1 in starting in r case we keep
// started iterating through the index 1 then we are multiplying the like this 
// res[i] = res[i-1]*nums[i-1];  i.e res[1] = res[0]*nums[0] --> res[1] = 1*1 --> res[1] = 1
// In this way we iterating through the array and final res array as {1,1,2,}
// Now keeping the postfix value as 1 and iterating again as postifix from end of array last value remains same as it is multiplied by 1 and then after upadating the
// postfix as postfix * nums[res.length-i-1]; now the value of postfix becomes 4 in this way we get our final result.
// time complexity : O(n)
  
// Solution 2: if not mention O(N) time complexity then directly get the product of array and and divide it with nums[i]


class Solution {
    public int[] productExceptSelf(int[] nums) {
        int[] res = new int[nums.length];
		res[0] = 1;
		for(int i = 1; i < nums.length; i++)
		{
			res[i] = res[i-1]*nums[i-1];
		}
		int postfix = 1;
		for(int i = 0; i < nums.length; i++)
		{
			res[res.length-i-1] = res[res.length-i-1] * postfix;
			postfix = postfix * nums[res.length-i-1]; 
		} 
        return res;
    }
}
