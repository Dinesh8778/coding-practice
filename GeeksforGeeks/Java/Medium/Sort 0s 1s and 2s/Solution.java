class Solution {
    public void sort012(int[] arr) {
        int zero = 0;
        int one = 0;
        int two = 0;
        
        for (int i : arr) {
            if (i == 0)
                zero++;
            else if (i == 1)
                one++;
            else
                two++;
        }
        
        int i = 0;
        while (zero != 0) {
            arr[i++] = 0;
            zero--;
        }
        while (one != 0) {
            arr[i++] = 1;
            one--;
        }
        while (two != 0) {
            arr[i++] = 2;
            two--;
        }
    }
}
