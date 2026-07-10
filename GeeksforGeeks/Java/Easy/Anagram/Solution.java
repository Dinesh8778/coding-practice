class Solution {
    public bool areAnagrams(string s1, string s2) {
        int[] freq1 = new int[26];
        int[] freq2 = new int[26];
        
        for(int i = 0 ; i < s1.Length ; i++){
            freq1[s1[i]-'a']++;
        }
        for(int i = 0 ; i < s2.Length ; i++){
            freq2[s2[i]-'a']++;
        }
        
        for(int i = 0 ; i < 26 ; i++){
            if(freq1[i] != freq2[i]) return false;
        }
        
        return true;
        
    }
}