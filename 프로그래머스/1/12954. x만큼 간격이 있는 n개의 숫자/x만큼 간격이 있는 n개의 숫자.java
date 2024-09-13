class Solution {
    public long[] solution(long x, int n) {
        long[] arr = new long[n];
        for (int i = 0 ; i < n ; i++) {
            arr[i] = x * (i + 1);
        }
    return arr;
    }
}