class Solution {
    public boolean isIdentical(List<Integer> a, List<Integer> b) {
        
        HashMap <Integer, Integer> freq1 = new HashMap<>();
        HashMap <Integer, Integer> freq2 = new HashMap<>();
        
        for (int i : a) {
            freq1.put(i, freq1.getOrDefault(i, 0) + 1);
        }
        
        for (int i : b) {
            freq2.put(i, freq2.getOrDefault(i, 0) + 1);
        }
        
        return freq1.equals(freq2);
    }
}
