class Solution {
    public boolean checkIfPangram(String sentence) {
        int[] freqarr = new int[26];
        for(char ch : sentence.toCharArray()){
            freqarr[ch - 'a']++;
        }
        for(int num : freqarr){
            if(num == 0){
                return false;
            }
        }
        return true;
    }
}