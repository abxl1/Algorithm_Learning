import java.util.Arrays;

class Solution {
    public long solution(long number) {
        // 각 자리 숫자를 저장할 배열 초기화
        String numberStr = Long.toString(number);
        int length = numberStr.length();
        Integer[] digits = new Integer[length];

        // 숫자를 자릿수로 분리하여 배열에 저장
        for (int i = 0; i < length; i++) {
            digits[i] = numberStr.charAt(i) - '0';
        }

        // 배열을 내림차순으로 정렬
        Arrays.sort(digits, (a, b) -> b - a);

        // 정렬된 배열을 숫자로 결합
        long reversedNumber = 0;
        for (int i = 0; i < length; i++) {
            reversedNumber = reversedNumber * 10 + digits[i];
        }

        return reversedNumber;
    }
}