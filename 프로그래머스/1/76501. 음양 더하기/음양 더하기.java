class Solution {
    public int solution(int[] abs, boolean[] sn) {
        // 실제 정수들의 합
        int sum = 0;
        
        // 양수, 음수(0은 제외) 판별 -> 0과 비교
        for (int i = 0; i < sn.length; i++) {
            // if문으로 판별
            if (sn[i]) {
                sum += abs[i];
            } else {
                sum -= abs[i];
            }
            
            // 삼항연산자의 사용
            // sum += sn[i] ? abs[i] : -abs[i];        
        }
        return sum;
    }
}