package leetcode;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;

public class LongestPalindrome {
    public int longestPalindrome0(String s) {
        int res = 0;
//        Map<Character, Integer> dict = new HashMap<>();
//        for (int i=0; i<s.length(); i++) {
//            dict.put(s.charAt(i), dict.get(s.charAt(i)) + 1);
//        }
//        Integer  values = dict.values().toArray();
//        for (int i = 0; i < dict.size(); i++) {
//            if ()
//        }
        return res;
    }

    public int longestPalindrome(String s) {
        int res = 0;
        int len = s.length();
        while (s.length()>1) {
            if (s.substring(1).contains(s.substring(0, 1))) {
                int index = s.substring(1).lastIndexOf(s.substring(0, 1));
                if (index == 0) {
                    s = s.substring(2);
                } else if (index == s.length()-2) {
                    s = s.substring(1, s.length()-1);
                } else {
                    s = s.substring(1, index+1) + s.substring(index+2);
                }
                res+=2;
            } else {
                s = s.substring(1);
            }
        }
        return res<len?res+1:res;
    }
}
