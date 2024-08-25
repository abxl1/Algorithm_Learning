class Solution {
    public int solution(int left, int right) {
        int result = 0;
        for (int i = left; i <= right; i++) {
            int divCount = 0;
            for (int j = 1; j <= i; j++) if (i % j == 0) divCount++;
            result = (divCount % 2 == 0) ? result + i : result - i;
        }
        return result;
    }
}