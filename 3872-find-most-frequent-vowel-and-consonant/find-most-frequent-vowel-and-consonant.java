class Solution {
    public int maxFreqSum(String s) {        
        int[] freqarr = new int[26];
        int maxvowel = 0;
        int maxconsonant = 0;
        for(int t = 0; t < s.length(); t++){
            freqarr[s.charAt(t) - 'a']++;
        }
        for(int j = 0; j < 26; j++){
            if(j == 0 || j == 4 || j == 8 || j == 14 || j == 20 ){
                  maxvowel = Math.max(maxvowel, freqarr[j]);
            }else {
                  maxconsonant = Math.max(maxconsonant, freqarr[j]);
            }
        }
        return maxvowel + maxconsonant;
    }
}