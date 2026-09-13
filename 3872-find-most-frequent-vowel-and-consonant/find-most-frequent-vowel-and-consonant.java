class Solution {
    public int maxFreqSum(String s) {        
        int[] freqarr = new int[26];
        int maxvowel = 0;
        int maxconsonant = 0;
        for(int i = 0; i < s.length(); i++){
            freqarr[s.charAt(i) - 'a']++;
        }
        for(int i = 0; i < 26; i++){
            if(i == 0 || i == 4 || i == 8 || i == 14 || i == 20 ){
                  maxvowel = Math.max(maxvowel, freqarr[i]);
            }else {
                  maxconsonant = Math.max(maxconsonant, freqarr[i]);
            }
        }
        return maxvowel + maxconsonant;
    }
}