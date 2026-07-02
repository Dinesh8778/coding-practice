class Solution {
    public ArrayList<Integer> getMinMax(int[] arr) {
        ArrayList<Integer> ans = new ArrayList<>();
        int max = 0, min = Integer.MAX_VALUE;
        
        for (int i : arr) {
            if (max < i)
                max = i;
            if (min > i)
                min = i;
        }
        ans.add(min);
        ans.add(max);
        return ans;
    }
}
