class Solution {
    public int solution(int n) {
        int sum = 0;
        for (int i=1; i <= n; i++) { // 정수의 약수는 1부터
            if (n % i == 0) sum += i;
        }
        return sum;
    }
}