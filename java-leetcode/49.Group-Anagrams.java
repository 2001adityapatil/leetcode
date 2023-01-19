// Given an array of strings strs, group the anagrams together. You can return the answer in any order.

// An Anagram is a word or phrase formed by rearranging the letters of a different word or phrase, typically using all the original letters exactly once.

 

// Example 1:

// Input: strs = ["eat","tea","tan","ate","nat","bat"]
// Output: [["bat"],["nat","tan"],["ate","eat","tea"]]
// Example 2:

// Input: strs = [""]
// Output: [[""]]
// Example 3:

// Input: strs = ["a"]
// Output: [["a"]]

List<List<String>>s=new ArrayList<>();
        Map<String,List<String>>map=new LinkedHashMap<>();
        
        for(String e:strs){
        	System.out.println(e);
            char ch[]=e.toCharArray();
            Arrays.sort(ch);
            String str=new String(ch);
            
            if(!map.containsKey(str)){
                map.put(str,new ArrayList<>());
            }
            // System.out.println(map);

            map.get(str).add(e);
            // System.out.println(map);
        }
        s.addAll(map.values());
        // System.out.print(s);

// Soltion: We created te List to maintain the order collection and LinkedHashMap that contains values based on the key it has one key as string and other one as List to
// maintain the list then we are iterating through the given array and sorting the string checking if string is available in Map if not puting the string and empty 
// arrayList as a pair in it if the string is available then we are just getting the key that is actual sorted string and putting the iterated value of string in array
// after all the iterations we will have map that have the key value pairs of sorted string and the remaining strings and finally we are adding the values in list 
