package com.java.leetcode.solutions.strings;

import java.util.HashSet;
import java.util.Set;

public class LongestSubstringWithoutRepeatingCharacters {

    public int lengthOfLongestSubstring(String s) {
        Set<Character> set = new HashSet<>();
        int maxLength = 0;
        int left = 0;
        int right = 0;
        for(; right < s.length(); ++right){
            if(set.contains(s.charAt(right))){
                while(s.charAt(left) != s.charAt(right)){
                    set.remove(s.charAt(left++));
                }
                set.remove(s.charAt(left++));
            }
            maxLength = Math.max(maxLength, right - left + 1);
            set.add(s.charAt(right));
        }

        return maxLength;
    }

}
