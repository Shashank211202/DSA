class Solution {
    public String reverseStr(String s, int k) {
        char[] arr = s.toCharArray();
        for(int x = 0; x < arr.length; x += (2 * k)){
             int n = Math.min(k, arr.length - x);
             for(int i = 0; i < n / 2; i++){
                char temp = arr[x + i];
                arr[x + i] = arr[x + n - 1 - i];
                arr[x + n - 1 - i] = temp;
             }
        }
        return new String(arr);
    }
}