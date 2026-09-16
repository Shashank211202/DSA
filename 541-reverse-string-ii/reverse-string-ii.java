class Solution { 
    public void reverse(char[] s, int left, int right) { 
        while(left < right) { 
            char temp = s[left]; 
            s[left] = s[right]; 
            s[right] = temp; 
            
            left++;
            right--;
        } 
    } 
    public String reverseStr(String s, int k) { 
        char[] arr = s.toCharArray(); 
        if(s.length() < k)
            reverse(arr, 0, s.length() - 1); 
        else {
            for(int i = 0; i < s.length(); i += 2 * k) { 
                int end = Math.min(i + k - 1, s.length() - 1);
                reverse(arr, i, end); 
            } 
        }
        return new String(arr); 
    } 
}