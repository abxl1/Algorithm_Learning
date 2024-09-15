class Solution {
    public long solution(long n) {
        long result = 0; // long 결과값
        double x = Math.sqrt(n); // double x는 n의 제곱근
        if (x % 1 == 0) { // x가 정수라면
            result = (long) Math.pow((x+1), 2); // x+1을 제곱
        } else {
            result = -1; // 정수가 아닌 실수라면 -1
        }
        return result;
    }
}