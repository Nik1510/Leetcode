class Solution {
    public int captureForts(int[] arr) {
        int fo = -1; 
        int res = 0; 
        int i = 0;

        while (i < arr.length) {
            if (arr[i] == 1 || arr[i] == -1) { 
                if (fo != -1 && arr[i] != arr[fo]) {
                    int d = i - fo - 1; 
                    res = Math.max(res, d);
                }
                fo = i; 
            }
            i++;
        }

        return res;
    }
}
