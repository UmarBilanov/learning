package leetcode;

public class IsSubsequence {
    public boolean isSubsequence(String s, String t) {
        for (int i = 0; i < s.length(); i++) {
            if (!t.contains(s.subSequence(i, i+1))) {
                return false;
            } else {
                t = t.substring(t.indexOf(s.substring(i, i+1)) + 1);
                System.out.println(t);
            }
        }
        return true;
    }
}
