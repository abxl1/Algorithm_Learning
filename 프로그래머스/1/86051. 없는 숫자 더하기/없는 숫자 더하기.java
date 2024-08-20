class Solution {
    public int solution(int[] nums) {
        // 0부터 9까지의 합 45 - nums 요소 합 = result
        int sum = 0;
        for (int i : nums) sum += i;
        return 45 - sum;
    }
}