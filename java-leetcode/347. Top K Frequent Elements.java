// Given an integer array nums and an integer k, return the k most frequent elements. You may return the answer in any order.

// Example 1:

// Input: nums = [1,1,1,2,2,3], k = 2
// Output: [1,2]
// Example 2:

// Input: nums = [1], k = 1
// Output: [1]

// Solution
// 1.Create a HashMap to store the frequency of each element in the input array.
// 2.Iterate through the input array, and for each element, update its frequency in the HashMap by incrementing its value or adding it to the HashMap if it does not exist.
// 3.Sort the elements in the HashMap based on their frequency in descending order.
// 4.Extract the top k elements with the highest frequency from the sorted HashMap.

// Complexity

// Time complexity:
// O(nlogn)

// Space complexity:
// O(n)

class Solution {
    public int count(int ch, int[] nums)
		{
			int c = 0;
			for(int i = 0; i < nums.length; i++)
			{
				if(nums[i] == ch)
					c++;
			}
			return c;
		}
    public int[] topKFrequent(int[] nums, int k) {
        int res[] = new int[k];

        // if(nums.length == 1)
        // return nums;

		HashMap<Integer, Integer> map = new HashMap<>();

		for(int i = 0; i < nums.length; i++)
		{
			if(!map.containsKey(nums[i]))
				map.put(nums[i], count(nums[i], nums));


		}
			System.out.println(map);
		List<Integer> mapKeys = new ArrayList<>(map.keySet());
    	List<Integer> mapValues = new ArrayList<>(map.values());
    	Collections.sort(mapValues);
    	Collections.sort(mapKeys);

		LinkedHashMap<Integer, Integer> sortedMap =
        new LinkedHashMap<>();

    	Iterator<Integer> valueIt = mapValues.iterator();
    	while (valueIt.hasNext()) {
        int val = valueIt.next();
        Iterator<Integer> keyIt = mapKeys.iterator();

        while (keyIt.hasNext()) {
            Integer key = keyIt.next();
            int comp1 = map.get(key);
            int comp2 = val;

            if (comp1 == comp2) {
                keyIt.remove();
                sortedMap.put(key, val);
                break;
            }
        }
    }
    System.out.print(sortedMap);

List<Integer> alKeys
            = new ArrayList<Integer>(sortedMap.keySet());

    	int c = 0;
            for(int i = 0; i < alKeys.size(); i++)
            {
            	if(c == k)
						break;
				else{
    				res[c] = alKeys.get(alKeys.size()-i-1);
    				c++;
    			}
            }
        return res;    
    }
}
