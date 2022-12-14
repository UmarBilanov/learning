package leetcode;

import java.util.HashMap;
import java.util.Map;

public class IsomorphicStrings {

    public boolean isIsomorphic(String s, String t) {
        Map m = new HashMap();
        for (Integer i=0; i<s.length(); ++i){
            if (m.put(s.charAt(i), i) != m.put(t.charAt(i)+"", i)) return false;
        }
        return true;
    }
}
