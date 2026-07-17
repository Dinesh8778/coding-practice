class Solution {
    public int[] gcdValues(int[] nums, long[] queries) {
        ArrayList<Integer> gcdPairs = new ArrayList();
        for(int  i = 0 ; i < nums.length ; i++){
            for(int j = i+1 ; j < nums.length ; j++){
                gcdPairs.add(GCD(nums[i],nums[j]));
            }
        }
        Collections.sort(gcdPairs);
        int[] ans = new int[queries.length];
        int k = 0;
        for(long i : queries){
            int j = (int) i;
            ans[k++] = gcdPairs.get(j);
        }
        return ans;
    }

    static int GCD(int a, int b){
        if(b == 0) return a;
        return GCD(b,a%b);
    } 
}