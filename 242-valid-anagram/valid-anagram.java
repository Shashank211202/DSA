class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length() != t.length()) return false;
        
        int[] freqarr = new int[26];
        for(int i = 0; i < s.length(); i++){
            freqarr[s.charAt(i) - 'a']++;
            freqarr[t.charAt(i) - 'a']--;
        }
        for(int count : freqarr){
            if(count != 0) return false;
        }
        return true;
    }
}