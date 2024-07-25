class Solution {
    public long[] solution(int x, int n) {
        long[] arr = new long[n];
        for (int i = 0 ; i < n ; i++) {
            arr[i] = (long) x * (i + 1);
        }
    return arr;
    }
}