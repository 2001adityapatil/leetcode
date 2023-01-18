
// Given an integer array nums, return true if any value appears at least twice in the array, and return false if every element is distinct.
// Example 1:

// Input: nums = [1,2,3,1]
// Output: true
// Example 2:

// Input: nums = [1,2,3,4]
// Output: false
// Example 3:

// Input: nums = [1,1,1,3,3,4,3,2,4,2]
// Output: true

// Solution: we can iterate through the array and push into the hashset to get rid of duplicate elements after we have distinct elements in the in hashset and then if the 
//           size of array is same it will return false else true

class Solution {
    public boolean containsDuplicate(int[] nums) {
        HashSet<Integer> hs = new HashSet<Integer>();

		for(int i = 0; i < nums.length; i++)
			hs.add(nums[i]);

        if(hs.size() == nums.length)
        return false;
        else
        return true;
    }
}
