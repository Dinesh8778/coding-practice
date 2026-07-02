class Solution {
    public static int largest(int[] arr) {
        int max = 0;
        for(int i : arr){
            if(max < i) max = i;
        }
        return max;
    }
}
