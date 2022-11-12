package leetcode;

public class IsSubsequence {
    public boolean isSubsequence(String s, String t) {
        for (int i = 0; i < s.length(); i++) {
            if (!t.contains(s.subSequence(i, i+1))) {
                return false;
            } else {
                t = t.substring(t.indexOf(s.substring(i, i+1)) + 1);
            }
        }
        return true;
    }

    public boolean isSubsequence1(String s, String t) {
        while (s.length() >= 1) {
            if (!t.contains(s.substring(0,1))){
                return false;
            } else {
                t = t.substring(t.indexOf(s.charAt(0)) + 1);
                s = s.substring(1);
            }
        }
        return true;
    }
}
