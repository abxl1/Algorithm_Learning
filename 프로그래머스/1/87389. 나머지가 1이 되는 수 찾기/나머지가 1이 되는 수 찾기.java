class Solution {
    public int solution(int n) {
        int x = 1;
        while (true) {
            if (n % x == 1) {
                return x;
            }
            x++;
        }
    }
}
