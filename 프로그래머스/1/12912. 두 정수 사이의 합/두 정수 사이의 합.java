class Solution {
    public long solution(int a, int b) {
        long result = 0;
        if (a == b) return a; 
        else if (b > a) {
            for (int i = 0; i <= b-a; i++) {
                result += a + i;
            }
            return result;
        } else {
            for (int i = 0; i <= a-b; i++) {
                result += b + i;
            }
            return result;
        }
    }
}

// class Solution {
//     public long solution(int a, int b) {
//         // a와 b의 최솟값과 최댓값을 구함
//         int min = Math.min(a, b);
//         int max = Math.max(a, b);
        
//         // 두 정수 사이의 모든 정수의 개수를 계산
//         int n = max - min + 1;
        
//         // 가우스 합 공식을 사용하여 결과 계산
//         long result = (long)n * (min + max) / 2;
        
//         return result;
//     }
// }