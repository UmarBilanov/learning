package leetcode;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;

public class LongestPalindrome {
    public int longestPalindrome0(String s) {
        int res = 0;
        Map<Character, Integer> dict = new HashMap<>();
        for (int i=0; i<s.length(); i++) {
            dict.put(s.charAt(i), dict.get(s.charAt(i)) + 1);
        }
        Integer  values = dict.values().toArray();
        for (int i = 0; i < dict.size(); i++) {
            if ()
        }
        return res.get();
    }

    public int longestPalindrome(String s) {
        int res = 1;
        char temp = s.charAt(0);
        for (int i=1; i<s.length(); i++) {

            s=s.substring(i);
        }
    }
}
