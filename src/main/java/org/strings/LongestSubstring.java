package org.strings;

import java.util.HashMap;

/**
 * Longest substring without repeating characters use a sliding window and
 * Hashmap to find a the length of the greatest substring without duplicate characters
 */

public class LongestSubstring {

    public static int LengthOfLongestSubString(String str){
        int start = 0;
        int maxLen = 0;

        HashMap<Character,Integer> map = new HashMap<>();

        for(int end=0; end < str.length(); end++){

            char curr = str.charAt(end); // current character

            if(map.containsKey(curr)){
                start = Math.max(start, map.get(curr)+1);
            }
            map.put(curr,end);
            maxLen = Math.max(maxLen, end-start + 1);
        }
        return maxLen;
    }

    public static void main(String args[]){
        String input = "abcdeab";

        int ml = LengthOfLongestSubString(input);
        System.out.println(ml);
    }
}
