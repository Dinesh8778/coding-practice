public class Solution {
    public List<int> getMinMax(int[] arr) {
        List<int> list = new List<int>();
        int max = -1, min = arr[0];
        foreach(int i in arr) {
            if (max < i) {
                max = i;
            }
            if (min > i) {
                min = i;
            }
        }
        list.Add(min);
        list.Add(max);
        return list;
    }
}
