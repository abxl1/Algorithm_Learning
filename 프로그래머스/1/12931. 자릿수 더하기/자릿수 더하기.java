public class Solution {
    public int solution(int n) {
        int sum = 0; // 총합 저장 변수
        while (n > 0) { // n이 양수일 동안
            sum += n % 10; // n을 10으로 나눈 나머지 더하기
            n /= 10; // n을 10으로 나눈 몫 저장
        }
        return sum; 
    }
}