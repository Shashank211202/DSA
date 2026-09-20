import java.util.HashMap;

public class Solution {
    public boolean isIsomorphic(String s, String t) {
        HashMap<Character, Character> mapST = new HashMap<>();
        HashMap<Character, Character> mapTS = new HashMap<>();

        for (int i = 0; i < s.length(); i++) {

            char cs = s.charAt(i);
            char ct = t.charAt(i);

            if (!mapST.containsKey(cs) && !mapTS.containsKey(ct)) {
                mapST.put(cs, ct);
                mapTS.put(ct, cs);
            } else {
                if (mapST.get(cs) == null || mapST.get(cs) != ct ||
                    mapTS.get(ct) == null || mapTS.get(ct) != cs) {
                    return false;
                }
            }
        }

        return true;
    }
}