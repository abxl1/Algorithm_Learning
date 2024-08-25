class Solution {
    public int solution(int left, int right) {
        int result = 0;
        for (int i = left; i <= right; i++) {
            int divCount = 0;
            for (int j = 1; j <= i; j++) {
                if (i % j == 0) divCount++;
            }
            if (divCount % 2 == 0 ) result += i; 
            else result -= i;
        }
        return result;
        
        // 소수도 아니고 제곱수도 아닌 수가 있을까?
        // 자연수는 소수와 제곱수의 조합인가?
        // 1(아무것도아님) - 홀수
        // 2, 3, 5, 7, 11, 13, 17 - 짝수
        // 4, 9, 16, 25 - 홀수
        // 약수의 개수를 구하는 로직 : 소인수의 지수의 +1개
        // 근데 소인수를 어케 구함?? 지수는?? 
    }
}