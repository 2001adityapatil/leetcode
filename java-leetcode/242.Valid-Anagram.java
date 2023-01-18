// Given two strings s and t, return true if t is an anagram of s, and false otherwise.

// An Anagram is a word or phrase formed by rearranging the letters of a different word or phrase, typically using all the original letters exactly once.

// Example 1:

// Input: s = "anagram", t = "nagaram"
// Output: true
// Example 2:

// Input: s = "rat", t = "car"
// Output: false

// Solution 1: Here we can use the hashmap where we are iterating through the string if char is already present in string we are skiping it else we are adding the pair
//             of character and integer i.e the number of occurences of character in the string. samething for the second string we are maping and checking if map1 and
//             map2 is equal if equal return true else false    
  
Code:
class Solution {
    public int count(char ch, String str)
	{
		int c = 0;
		for(int i = 0; i < str.length(); i++)
		{
			if(str.charAt(i) == ch)
				c++;
		}
		return c;
	}
    public boolean isAnagram(String s, String t) {
        HashMap<Character, Integer> mp1 = new HashMap<Character, Integer>();

		for(int i = 0; i < t.length(); i++)
		{
			if(mp1.containsKey(t.charAt(i)))
				continue;
			else
				mp1.put(t.charAt(i), count(t.charAt(i), t));
		}

		HashMap<Character, Integer> mp2 = new HashMap<Character, Integer>();

		for(int i = 0; i < s.length(); i++)
		{
			if(mp2.containsKey(s.charAt(i)))
				continue;
			else
				mp2.put(s.charAt(i), count(s.charAt(i), s));
		}

		// System.out.println(mp1);
		// System.out.println(mp2);


		if(mp1.equals(mp2))
			return true;
		else
			return false;
    }
}
