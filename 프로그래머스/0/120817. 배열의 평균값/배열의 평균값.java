class Solution {
    public double solution(int[] numbers) { // 정수 배열 numbers 매개변수
        int sum = 0; // 원소들의 합 초기화
        for (int i = 0; i < numbers.length ; i++) { 
            // 인덱스 i 초기화; 배열의 길이 미만까지; 인덱스 1씩 증가
            sum += numbers[i];
            // sum 변수에 배열의 모든 원소 합
        }
        return (double) sum / numbers.length;
        // 배열의 모든 원소 합을 배열의 길이로 나누고 double로 캐스팅
    }
}